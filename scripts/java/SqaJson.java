package sqa.support;
import java.util.*;
import java.util.regex.*;
/** Tiny dependency-free writer and flat configuration reader; avoids shadowing a Gson SUT. */
public final class SqaJson {
  private SqaJson() {}
  public static String quote(String value) {
    StringBuilder s=new StringBuilder("\"");
    for(int i=0;i<value.length();i++){
      char c=value.charAt(i);
      switch(c){case '\\':s.append("\\\\");break;case '"':s.append("\\\"");break;case '\n':s.append("\\n");break;case '\r':s.append("\\r");break;case '\t':s.append("\\t");break;default:if(c<32 || c>126)s.append(String.format("\\u%04x",(int)c));else s.append(c);}
    }return s.append('"').toString();
  }
  public static String write(Object value){
    if(value==null)return "null";
    if(value instanceof String || value instanceof Character)return quote(value.toString());
    if(value instanceof Number || value instanceof Boolean)return value.toString();
    if(value instanceof Map<?,?>){List<String> items=new ArrayList<>();((Map<?,?>)value).forEach((k,v)->items.add(quote(k.toString())+":"+write(v)));return "{"+String.join(",",items)+"}";}
    if(value instanceof Iterable<?>){List<String> items=new ArrayList<>();for(Object v:(Iterable<?>)value)items.add(write(v));return "["+String.join(",",items)+"]";}
    return quote(value.toString());
  }
  static String unquote(String s){
    StringBuilder out=new StringBuilder();
    for(int i=0;i<s.length();i++){char c=s.charAt(i);if(c!='\\'){out.append(c);continue;}c=s.charAt(++i);switch(c){case 'n':out.append('\n');break;case 'r':out.append('\r');break;case 't':out.append('\t');break;case 'u':out.append((char)Integer.parseInt(s.substring(i+1,i+5),16));i+=4;break;default:out.append(c);}}
    return out.toString();
  }
  public static Map<String,Object> readFlat(String json){
    Map<String,Object> values=new LinkedHashMap<>();
    Matcher m=Pattern.compile("\"([^\"]+)\"\\s*:\\s*(\"(?:\\\\.|[^\"\\\\])*\"|-?[0-9]+(?:\\.[0-9]+)?|true|false|null)").matcher(json);
    while(m.find()){String v=m.group(2);Object value;
      if(v.startsWith("\""))value=unquote(v.substring(1,v.length()-1));
      else if(v.equals("true") || v.equals("false"))value=Boolean.valueOf(v);
      else if(v.equals("null"))value=null;
      else value=Double.valueOf(v);
      values.put(m.group(1),value);
    }return values;
  }
}
