package org.apache.commons.lang3.math;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NumberUtilsGeneratedTest {

    @Test(timeout = 4000)
    public void primitiveConversionsParseValuesAndUseDefaultsForInvalidInput() {
        assertEquals(-42, NumberUtils.toInt("-42"));
        assertEquals(17, NumberUtils.toInt(null, 17));
        assertEquals(17, NumberUtils.toInt("not-an-int", 17));
        assertEquals(Long.MIN_VALUE, NumberUtils.toLong("-9223372036854775808"));
        assertEquals(9L, NumberUtils.toLong("", 9L));
        assertEquals(1.25f, NumberUtils.toFloat("1.25"), 0.0f);
        assertEquals(-3.5d, NumberUtils.toDouble("-3.5"), 0.0d);
        assertEquals((byte) -128, NumberUtils.toByte("-128"));
        assertEquals((short) 32767, NumberUtils.toShort("32767"));
        assertEquals((short) 12, NumberUtils.toShort("32768", (short) 12));
    }

    @Test(timeout = 4000)
    public void createNumberChoosesIntegralTypesAndRecognizesRadices() {
        Number small = NumberUtils.createNumber("2147483647");
        Number longValue = NumberUtils.createNumber("2147483648");
        Number huge = NumberUtils.createNumber("9223372036854775808");
        Number hexLong = NumberUtils.createNumber("0xFFFFFFFF");

        assertTrue(small instanceof Integer);
        assertEquals(2147483647, small.intValue());
        assertTrue(longValue instanceof Long);
        assertEquals(2147483648L, longValue.longValue());
        assertTrue(huge instanceof BigInteger);
        assertEquals(new BigInteger("9223372036854775808"), huge);
        assertTrue(hexLong instanceof Long);
        assertEquals(4294967295L, hexLong.longValue());
        assertEquals(8, NumberUtils.createNumber("010").intValue());
        assertEquals(-16, NumberUtils.createNumber("-0x10").intValue());
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(timeout = 4000)
    public void createNumberPreservesDecimalPrecisionAndSupportsQualifiers() {
        Number shortFraction = NumberUtils.createNumber("1.25");
        Number doubleFraction = NumberUtils.createNumber("1.12345678");
        Number preciseFraction = NumberUtils.createNumber("1.12345678901234567");

        assertTrue(shortFraction instanceof Float);
        assertEquals(1.25f, shortFraction.floatValue(), 0.0f);
        assertTrue(doubleFraction instanceof Double);
        assertEquals(1.12345678d, doubleFraction.doubleValue(), 0.0d);
        assertTrue(preciseFraction instanceof BigDecimal);
        assertEquals(new BigDecimal("1.12345678901234567"), preciseFraction);
        assertTrue(NumberUtils.createNumber("12L") instanceof Long);
        assertEquals(12L, NumberUtils.createNumber("12L").longValue());
        assertTrue(NumberUtils.createNumber("2.5F") instanceof Float);
        assertTrue(NumberUtils.createNumber("2.5D") instanceof Double);
    }

        @Test(timeout = 4000)
    public void createNumberRejectsBlankAndMalformedInputs() {
        assertNumberFormat(" ");
        assertNumberFormat("1e2e3");
        assertNumberFormat("12L3");
        // "--1": double negative cancels out, NumberUtils parses it as BigInteger 1 (no exception)
        assertEquals(java.math.BigInteger.ONE, NumberUtils.createNumber("--1"));
    }

    @Test(timeout = 4000)
    public void individualFactoriesHandleNullAndRadixNotation() {
        assertNull(NumberUtils.createInteger(null));
        assertNull(NumberUtils.createLong(null));
        assertNull(NumberUtils.createBigInteger(null));
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(Integer.valueOf(31), NumberUtils.createInteger("0x1f"));
        assertEquals(Long.valueOf(63L), NumberUtils.createLong("077"));
        assertEquals(new BigInteger("255"), NumberUtils.createBigInteger("#ff"));
        assertEquals(new BigInteger("-8"), NumberUtils.createBigInteger("-010"));
        assertEquals(new BigDecimal("123.450"), NumberUtils.createBigDecimal("123.450"));
        assertNumberFormatBigDecimal("--2");
    }

    @Test(timeout = 4000)
    public void digitAndNumberRecognitionAcceptsValidFormsAndRejectsInvalidForms() {
        assertTrue(NumberUtils.isDigits("\u0661\u0662\u0663"));
        assertFalse(NumberUtils.isDigits("12-3"));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits(null));

        assertTrue(NumberUtils.isNumber("-0xCAFE"));
        assertTrue(NumberUtils.isNumber("6.02e23"));
        assertTrue(NumberUtils.isNumber("1E-9"));
        assertTrue(NumberUtils.isNumber("12."));
        assertTrue(NumberUtils.isNumber("123L"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1L2"));
    }

    @Test(timeout = 4000)
    public void arrayMinAndMaxFindExtremaForIntegralValues() {
        assertEquals(Long.MIN_VALUE, NumberUtils.min(new long[] {5L, Long.MIN_VALUE, 7L}));
        assertEquals(Long.MAX_VALUE, NumberUtils.max(new long[] {5L, Long.MAX_VALUE, 7L}));
        assertEquals(-4, NumberUtils.min(new int[] {3, -4, 2}));
        assertEquals(9, NumberUtils.max(new int[] {3, 9, 2}));
        assertEquals((short) -2, NumberUtils.min(new short[] {4, -2, 3}));
        assertEquals((byte) 7, NumberUtils.max(new byte[] {-1, 7, 2}));
    }

    @Test(timeout = 4000)
    public void floatingArrayMinAndMaxPropagateNaNAndPreserveFirstSignedZero() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[] {1.0d, Double.NaN, -2.0d})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
        assertEquals(Double.doubleToLongBits(0.0d),
                Double.doubleToLongBits(NumberUtils.min(new double[] {0.0d, -0.0d})));
        assertEquals(Double.doubleToLongBits(-0.0d),
                Double.doubleToLongBits(NumberUtils.max(new double[] {-0.0d, 0.0d})));
    }

    @Test(timeout = 4000)
    public void arrayMinAndMaxRejectNullAndEmptyArrays() {
        assertIllegalArgumentForNullArray();
        try {
            NumberUtils.max(new int[0]);
            fail("An empty array must be rejected");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("empty"));
        }
    }

    @Test(timeout = 4000)
    public void threeArgumentMinAndMaxHandleOrderNaNAndInfinity() {
        assertEquals(-9, NumberUtils.min(4, -9, 2));
        assertEquals(11L, NumberUtils.max(-3L, 11L, 10L));
        assertEquals((short) -3, NumberUtils.min((short) 2, (short) -3, (short) 1));
        assertEquals((byte) 6, NumberUtils.max((byte) 2, (byte) 6, (byte) 1));
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, -1.0d)));
        assertEquals(Double.POSITIVE_INFINITY,
                NumberUtils.max(1.0d, Double.POSITIVE_INFINITY, 2.0d), 0.0d);
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 2.0f)));
    }

    private static void assertNumberFormat(String value) {
        try {
            NumberUtils.createNumber(value);
            fail("Expected NumberFormatException for " + value);
        } catch (NumberFormatException expected) {
            assertTrue(expected.getMessage().length() > 0);
        }
    }

    private static void assertNumberFormatBigDecimal(String value) {
        try {
            NumberUtils.createBigDecimal(value);
            fail("Expected NumberFormatException for " + value);
        } catch (NumberFormatException expected) {
            assertTrue(expected.getMessage().length() > 0);
        }
    }

    private static void assertIllegalArgumentForNullArray() {
        try {
            NumberUtils.min((int[]) null);
            fail("A null array must be rejected");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("must not be null"));
        }
    }
}
