package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * Regression tests for {@link NumberUtils}, generated from the fixed
 * revision of org.apache.commons.lang3.math.NumberUtils.
 */
public class NumberUtilsGeneratedTest {

    // ----------------------------------------------------------------
    // toInt
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToInt_null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test(timeout = 4000)
    public void testToInt_empty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test(timeout = 4000)
    public void testToInt_valid() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test(timeout = 4000)
    public void testToInt_negative() {
        assertEquals(-1, NumberUtils.toInt("-1"));
    }

    @Test(timeout = 4000)
    public void testToInt_invalid() {
        assertEquals(0, NumberUtils.toInt("not a number"));
    }

    @Test(timeout = 4000)
    public void testToIntWithDefault_null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test(timeout = 4000)
    public void testToIntWithDefault_empty() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test(timeout = 4000)
    public void testToIntWithDefault_valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test(timeout = 4000)
    public void testToIntWithDefault_invalid() {
        assertEquals(2, NumberUtils.toInt("xyz", 2));
    }

    // ----------------------------------------------------------------
    // toLong
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToLong_null() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test(timeout = 4000)
    public void testToLong_empty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test(timeout = 4000)
    public void testToLong_valid() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test(timeout = 4000)
    public void testToLong_invalid() {
        assertEquals(0L, NumberUtils.toLong("not a number"));
    }

    @Test(timeout = 4000)
    public void testToLongWithDefault_null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test(timeout = 4000)
    public void testToLongWithDefault_empty() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test(timeout = 4000)
    public void testToLongWithDefault_valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // ----------------------------------------------------------------
    // toFloat
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToFloat_null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test(timeout = 4000)
    public void testToFloat_empty() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test(timeout = 4000)
    public void testToFloat_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test(timeout = 4000)
    public void testToFloatWithDefault_null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test(timeout = 4000)
    public void testToFloatWithDefault_invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("not a number", 1.1f), 0.0f);
    }

    // ----------------------------------------------------------------
    // toDouble
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToDouble_null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test(timeout = 4000)
    public void testToDouble_empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test(timeout = 4000)
    public void testToDouble_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test(timeout = 4000)
    public void testToDoubleWithDefault_null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test(timeout = 4000)
    public void testToDoubleWithDefault_invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("not a number", 1.1d), 0.0d);
    }

    // ----------------------------------------------------------------
    // toByte
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToByte_null() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test(timeout = 4000)
    public void testToByte_empty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test(timeout = 4000)
    public void testToByte_valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test(timeout = 4000)
    public void testToByteWithDefault_invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("not a number", (byte) 1));
    }

    // ----------------------------------------------------------------
    // toShort
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testToShort_null() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test(timeout = 4000)
    public void testToShort_empty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test(timeout = 4000)
    public void testToShort_valid() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test(timeout = 4000)
    public void testToShortWithDefault_invalid() {
        assertEquals((short) 1, NumberUtils.toShort("not a number", (short) 1));
    }

    // ----------------------------------------------------------------
    // createNumber
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testCreateNumber_null() throws Exception {
        assertEquals(null, NumberUtils.createNumber(null));
    }

    @Test(timeout = 4000)
    public void testCreateNumber_blank() {
        try {
            NumberUtils.createNumber("   ");
            fail("Expected NumberFormatException for blank string");
        } catch (final NumberFormatException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testCreateNumber_plainInteger() throws Exception {
        final Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_negativeInteger() throws Exception {
        final Number n = NumberUtils.createNumber("-123");
        assertTrue(n instanceof Integer);
        assertEquals(-123, n.intValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_longRange() throws Exception {
        final Number n = NumberUtils.createNumber("12345678901");
        assertTrue(n instanceof Long);
        assertEquals(12345678901L, n.longValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_bigIntegerRange() throws Exception {
        final String value = "123456789012345678901234567890";
        final Number n = NumberUtils.createNumber(value);
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger(value), n);
    }

    @Test(timeout = 4000)
    public void testCreateNumber_floatQualifier() throws Exception {
        final Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test(timeout = 4000)
    public void testCreateNumber_doubleQualifier() throws Exception {
        final Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test(timeout = 4000)
    public void testCreateNumber_longQualifier() throws Exception {
        final Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_invalidLongQualifier() {
        try {
            NumberUtils.createNumber("1.5L");
            fail("Expected NumberFormatException for decimal with L qualifier");
        } catch (final NumberFormatException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testCreateNumber_decimalNoQualifier() throws Exception {
        final Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test(timeout = 4000)
    public void testCreateNumber_bigDecimalPrecision() throws Exception {
        // More than 16 digits past the decimal point forces BigDecimal
        final String value = "1.12345678901234567890";
        final Number n = NumberUtils.createNumber(value);
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal(value), n);
    }

    @Test(timeout = 4000)
    public void testCreateNumber_hexInteger() throws Exception {
        final Number n = NumberUtils.createNumber("0x10");
        assertTrue(n instanceof Integer);
        assertEquals(16, n.intValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_hexNegative() throws Exception {
        final Number n = NumberUtils.createNumber("-0x10");
        assertTrue(n instanceof Integer);
        assertEquals(-16, n.intValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_hashHex() throws Exception {
        final Number n = NumberUtils.createNumber("#10");
        assertTrue(n instanceof Integer);
        assertEquals(16, n.intValue());
    }

    @Test(timeout = 4000)
    public void testCreateNumber_invalid() {
        try {
            NumberUtils.createNumber("not a number");
            fail("Expected NumberFormatException for invalid input");
        } catch (final NumberFormatException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testCreateNumber_exponent() throws Exception {
        final Number n = NumberUtils.createNumber("1.5E2");
        assertEquals(150.0d, n.doubleValue(), 0.001d);
    }

    // ----------------------------------------------------------------
    // createFloat / createDouble / createInteger / createLong
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testCreateFloat_null() {
        assertEquals(null, NumberUtils.createFloat(null));
    }

    @Test(timeout = 4000)
    public void testCreateFloat_valid() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test(timeout = 4000)
    public void testCreateDouble_null() {
        assertEquals(null, NumberUtils.createDouble(null));
    }

    @Test(timeout = 4000)
    public void testCreateDouble_valid() {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test(timeout = 4000)
    public void testCreateInteger_null() {
        assertEquals(null, NumberUtils.createInteger(null));
    }

    @Test(timeout = 4000)
    public void testCreateInteger_valid() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test(timeout = 4000)
    public void testCreateInteger_hex() {
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
    }

    @Test(timeout = 4000)
    public void testCreateLong_null() {
        assertEquals(null, NumberUtils.createLong(null));
    }

    @Test(timeout = 4000)
    public void testCreateLong_valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    // ----------------------------------------------------------------
    // createBigInteger / createBigDecimal
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testCreateBigInteger_null() {
        assertEquals(null, NumberUtils.createBigInteger(null));
    }

    @Test(timeout = 4000)
    public void testCreateBigInteger_valid() {
        assertEquals(BigInteger.valueOf(123L), NumberUtils.createBigInteger("123"));
    }

    @Test(timeout = 4000)
    public void testCreateBigInteger_hex() {
        assertEquals(BigInteger.valueOf(16L), NumberUtils.createBigInteger("0x10"));
    }

    @Test(timeout = 4000)
    public void testCreateBigInteger_negativeHex() {
        assertEquals(BigInteger.valueOf(-16L), NumberUtils.createBigInteger("-0x10"));
    }

    @Test(timeout = 4000)
    public void testCreateBigInteger_octal() {
        assertEquals(BigInteger.valueOf(8L), NumberUtils.createBigInteger("010"));
    }

    @Test(timeout = 4000)
    public void testCreateBigDecimal_null() {
        assertEquals(null, NumberUtils.createBigDecimal(null));
    }

    @Test(timeout = 4000)
    public void testCreateBigDecimal_valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    @Test(timeout = 4000)
    public void testCreateBigDecimal_blank() {
        try {
            NumberUtils.createBigDecimal("   ");
            fail("Expected NumberFormatException for blank string");
        } catch (final NumberFormatException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testCreateBigDecimal_doubleMinus() {
        try {
            NumberUtils.createBigDecimal("--1.5");
            fail("Expected NumberFormatException for leading double minus");
        } catch (final NumberFormatException expected) {
            // expected
        }
    }

    // ----------------------------------------------------------------
    // min/max arrays
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[] {5L, 1L, 3L}));
    }

    @Test(timeout = 4000)
    public void testMinLongArray_nullThrows() {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testMinLongArray_emptyThrows() {
        try {
            NumberUtils.min(new long[0]);
            fail("Expected IllegalArgumentException for empty array");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[] {5, 1, 3}));
    }

    @Test(timeout = 4000)
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[] {(short) 5, (short) 1, (short) 3}));
    }

    @Test(timeout = 4000)
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[] {(byte) 5, (byte) 1, (byte) 3}));
    }

    @Test(timeout = 4000)
    public void testMinDoubleArray() {
        assertEquals(1.0d, NumberUtils.min(new double[] {5.0d, 1.0d, 3.0d}), 0.0d);
    }

    @Test(timeout = 4000)
    public void testMinDoubleArray_nan() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[] {5.0d, Double.NaN, 3.0d})));
    }

    @Test(timeout = 4000)
    public void testMinFloatArray() {
        assertEquals(1.0f, NumberUtils.min(new float[] {5.0f, 1.0f, 3.0f}), 0.0f);
    }

    @Test(timeout = 4000)
    public void testMinFloatArray_nan() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[] {5.0f, Float.NaN, 3.0f})));
    }

    @Test(timeout = 4000)
    public void testMaxLongArray() {
        assertEquals(5L, NumberUtils.max(new long[] {5L, 1L, 3L}));
    }

    @Test(timeout = 4000)
    public void testMaxLongArray_nullThrows() {
        try {
            NumberUtils.max((long[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void testMaxIntArray() {
        assertEquals(5, NumberUtils.max(new int[] {5, 1, 3}));
    }

    @Test(timeout = 4000)
    public void testMaxShortArray() {
        assertEquals((short) 5, NumberUtils.max(new short[] {(short) 5, (short) 1, (short) 3}));
    }

    @Test(timeout = 4000)
    public void testMaxByteArray() {
        assertEquals((byte) 5, NumberUtils.max(new byte[] {(byte) 5, (byte) 1, (byte) 3}));
    }

    @Test(timeout = 4000)
    public void testMaxDoubleArray() {
        assertEquals(5.0d, NumberUtils.max(new double[] {5.0d, 1.0d, 3.0d}), 0.0d);
    }

    @Test(timeout = 4000)
    public void testMaxDoubleArray_nan() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[] {5.0d, Double.NaN, 3.0d})));
    }

    @Test(timeout = 4000)
    public void testMaxFloatArray() {
        assertEquals(5.0f, NumberUtils.max(new float[] {5.0f, 1.0f, 3.0f}), 0.0f);
    }

    // ----------------------------------------------------------------
    // 3-param min/max
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testMin3Long() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
    }

    @Test(timeout = 4000)
    public void testMin3Int() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
    }

    @Test(timeout = 4000)
    public void testMin3Short() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test(timeout = 4000)
    public void testMin3Byte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test(timeout = 4000)
    public void testMin3Double() {
        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0d);
    }

    @Test(timeout = 4000)
    public void testMin3Double_nan() {
        assertTrue(Double.isNaN(NumberUtils.min(3.0d, Double.NaN, 2.0d)));
    }

    @Test(timeout = 4000)
    public void testMin3Float() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
    }

    @Test(timeout = 4000)
    public void testMax3Long() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test(timeout = 4000)
    public void testMax3Int() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test(timeout = 4000)
    public void testMax3Short() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test(timeout = 4000)
    public void testMax3Byte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test(timeout = 4000)
    public void testMax3Double() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0d);
    }

    @Test(timeout = 4000)
    public void testMax3Float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0f);
    }

    // ----------------------------------------------------------------
    // isDigits
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testIsDigits_null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test(timeout = 4000)
    public void testIsDigits_empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test(timeout = 4000)
    public void testIsDigits_allDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test(timeout = 4000)
    public void testIsDigits_withLetters() {
        assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test(timeout = 4000)
    public void testIsDigits_withDecimalPoint() {
        assertFalse(NumberUtils.isDigits("1.5"));
    }

    // ----------------------------------------------------------------
    // isNumber
    // ----------------------------------------------------------------

    @Test(timeout = 4000)
    public void testIsNumber_null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test(timeout = 4000)
    public void testIsNumber_empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test(timeout = 4000)
    public void testIsNumber_plainInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_negativeInteger() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_decimal() {
        assertTrue(NumberUtils.isNumber("1.5"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_hex() {
        assertTrue(NumberUtils.isNumber("0x1F"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_hexOnlyPrefix() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_exponent() {
        assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_doubleExponent() {
        assertFalse(NumberUtils.isNumber("1.5E10E5"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_trailingLetter() {
        assertFalse(NumberUtils.isNumber("123a"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_floatQualifier() {
        assertTrue(NumberUtils.isNumber("1.5F"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_longQualifier() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_longQualifierWithDecimal() {
        assertFalse(NumberUtils.isNumber("1.5L"));
    }

    @Test(timeout = 4000)
    public void testIsNumber_trailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test(timeout = 4000)
    public void testIsNumber_onlyDecimalPoint() {
        assertFalse(NumberUtils.isNumber("."));
    }
}