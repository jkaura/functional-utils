package fi.solita.utils.functional;

import static fi.solita.utils.functional.Collections.it;
import static fi.solita.utils.functional.Functional.filter;
import static fi.solita.utils.functional.Functional.map;
import static fi.solita.utils.functional.Predicates.not;

import java.util.Map;
import java.util.regex.Pattern;

public abstract class Transformers {
    
    public static final Transformer<String, String> append(final String suffix) { 
        return new Transformer<String, String>() {
            @Override
            public String transform(String source) {
                return source == null ? null : source + suffix;
            }
        };
    }
    
    public static final Transformer<CharSequence, String> prepend(final CharSequence prefix) { 
        return new Transformer<CharSequence, String>() {
            @Override
            public String transform(CharSequence source) {
                return prefix + source.toString();
            }
        };
    }
    
    public static final Transformer<String, String> replaceAll(final Pattern pattern, final String replacement) { 
        return new Transformer<String, String>() {
            @Override
            public String transform(String source) {
                return source == null ? null : pattern.matcher(source).replaceAll(replacement);
            }
        };
    }
    
    public static final Transformer<String, String> removeWhitespace = new Transformer<String, String>() {
        private final Predicate<Character> whitespace = new Predicate<Character>() {
            @Override
            public boolean accept(Character candidate) {
                return Character.isWhitespace(candidate);
            }
        };
        
        @Override
        public String transform(String source) {
            if (source == null) {
                return null;
            }
            return Functional.mkString("", map(filter(it(source), not(whitespace)), toString));
        }
    };
    
    public static final Transformer<Map.Entry<?, ?>, String> join(final String delim) {
        return new Transformer<Map.Entry<?, ?>, String>() {
            @Override
            public String transform(Map.Entry<?, ?> source) {
                return source.getKey() + delim + source.getValue();
            }
        };
    }
    
    public static final Transformer<Tuple, String> mkString(final String delim, final Apply<Object,CharSequence> toString) {
          return new Transformer<Tuple, String>() {
              @Override
              public String transform(Tuple source) {
                  return Functional.mkString(delim, map(source.toArray(), toString));
              }
          };
      }

    public static final Transformer<String, String> prefix(final int chars) {
        if (chars <= 0) {
            throw new IllegalArgumentException("chars must be >= 1");
        }
        return new Transformer<String, String>() {
            @Override
            public String transform(String source) {
                return source.substring(0, Math.min(chars, source.length()));
            }
        };
    };
    
    private static final Transformer<Map.Entry<?, ?>,Map.Entry<?, ?>> flip = new Transformer<Map.Entry<?, ?>,Map.Entry<?, ?>>() {
        @Override
        public Map.Entry<?, ?> transform(Map.Entry<?, ?> source) {
            return Tuple.of(source.getValue(), source.getKey());
        }
    };
    @SuppressWarnings("unchecked")
    public static final <K,V> Transformer<Map.Entry<K, V>,Map.Entry<V, K>> flip() {
        return (Transformer<Map.Entry<K, V>,Map.Entry<V, K>>)(Object)flip;
    };
    
    public static final Transformer<Integer, Integer> mod(final Integer mod) {
        return new Transformer<Integer, Integer>() {
            @Override
            public Integer transform(Integer source) {
                  return source % mod;
            }
        };
    }
    
    
    
    public static final Transformer<Long, Long> negate = new Transformer<Long,Long>() {
        @Override
        public Long transform(Long source) {
            return -1*source;
        }
    };
    
    public static final Transformer<Integer, Integer> negateInt = new Transformer<Integer,Integer>() {
        @Override
        public Integer transform(Integer source) {
            return -1*source;
        }
    };
    
    public static final Transformer<Short, Short> negateShort = new Transformer<Short,Short>() {
        @Override
        public Short transform(Short source) {
            return (short)(-1*source);
        }
    };
    
    
    
    public static final Transformer<Short, Long> short2long = new Transformer<Short,Long>() {
        @Override
        public Long transform(Short source) {
            return source.longValue();
        }
    };
    
    public static final Transformer<Integer, Long> int2long = new Transformer<Integer,Long>() {
        @Override
        public Long transform(Integer source) {
            return source.longValue();
        }
    };
    
    public static final Transformer<Object,String> toString = new Transformer<Object,String>() {
        @Override
        public String transform(Object source) {
            return source.toString();
        }
    };
    
    private static final Transformer<Pair<?,?>,?> left = new Transformer<Pair<?,?>,Object>() {
        @Override
        public Object transform(Pair<?,?> source) {
            return source.left;
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Pair<T,?>,T> left() {
        return (Transformer<Pair<T,?>,T>)(Object)left;
    }
    
    private static final Transformer<Pair<?,?>,?> right = new Transformer<Pair<?,?>,Object>() {
        @Override
        public Object transform(Pair<?,?> source) {
            return source.right;
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Pair<?,T>,T> right() {
        return (Transformer<Pair<?,T>,T>)(Object)right;
    }
    
    private static final Transformer<Either<?,?>,Option<?>> eitherLeft = new Transformer<Either<?,?>,Option<?>>() {
        @Override
        public Option<?> transform(Either<?,?> source) {
            return source.left;
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Either<T,?>,Option<T>> eitherLeft() {
        return (Transformer<Either<T,?>,Option<T>>)(Object)eitherLeft;
    }
    
    private static final Transformer<Either<?,?>,Option<?>> eitherRight = new Transformer<Either<?,?>,Option<?>>() {
        @Override
        public Option<?> transform(Either<?,?> source) {
            return source.right;
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Either<?,T>,Option<T>> eitherRight() {
        return (Transformer<Either<?,T>,Option<T>>)(Object)eitherRight;
    }
    
    private static final Transformer<Option<?>,?> get = new Transformer<Option<?>,Object>() {
        @Override
        public Object transform(Option<?> source) {
            return source.get();
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Option<T>,T> get() {
        return (Transformer<Option<T>,T>)(Object)get;
    }
    
    public static final Transformer<String,Iterable<Character>> it = new Transformer<String,Iterable<Character>>() {
        @Override
        public Iterable<Character> transform(String source) {
            return it(source);
        }
    };
    
    private static final Transformer<Iterable<?>, Object> head = new Transformer<Iterable<?>,Object>() {
        @Override
        public Object transform(Iterable<?> source) {
            return Functional.head(source);
        }
    };
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Iterable<T>,T> head() {
        return (Transformer<Iterable<T>,T>)(Object)head;
    }
    
    public static final Transformer<Iterable<?>, Long> size = new Transformer<Iterable<?>,Long>() {
        @Override
        public Long transform(Iterable<?> source) {
            return Functional.size(source);
        }
    };
    
    private static final Transformer<Tuple._1<?>,?> _1 = new Transformer<Tuple._1<?>,Object>() {
        @Override
        public Object transform(Tuple._1<?> source) {
            return source.get_1();
        }
    };
    private static final Transformer<Tuple._2<?>,?> _2 = new Transformer<Tuple._2<?>,Object>() {
        @Override
        public Object transform(Tuple._2<?> source) {
            return source.get_2();
        }
    };
    private static final Transformer<Tuple._3<?>,?> _3 = new Transformer<Tuple._3<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._3<?> source) {
            return source.get_3();
        }
    };
    private static final Transformer<Tuple._4<?>,?> _4 = new Transformer<Tuple._4<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._4<?> source) {
            return source.get_4();
        }
    };
    private static final Transformer<Tuple._5<?>,?> _5 = new Transformer<Tuple._5<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._5<?> source) {
            return source.get_5();
        }
    };
    private static final Transformer<Tuple._6<?>,?> _6 = new Transformer<Tuple._6<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._6<?> source) {
            return source.get_6();
        }
    };
    private static final Transformer<Tuple._7<?>,?> _7 = new Transformer<Tuple._7<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._7<?> source) {
            return source.get_7();
        }
    };
    private static final Transformer<Tuple._8<?>,?> _8 = new Transformer<Tuple._8<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._8<?> source) {
            return source.get_8();
        }
    };
    private static final Transformer<Tuple._9<?>,?> _9 = new Transformer<Tuple._9<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._9<?> source) {
            return source.get_9();
        }
    };
    private static final Transformer<Tuple._10<?>,?> _10 = new Transformer<Tuple._10<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._10<?> source) {
            return source.get_10();
        }
    };
    private static final Transformer<Tuple._11<?>,?> _11 = new Transformer<Tuple._11<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._11<?> source) {
            return source.get_11();
        }
    };
    private static final Transformer<Tuple._12<?>,?> _12 = new Transformer<Tuple._12<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._12<?> source) {
            return source.get_12();
        }
    };
    private static final Transformer<Tuple._13<?>,?> _13 = new Transformer<Tuple._13<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._13<?> source) {
            return source.get_13();
        }
    };
    private static final Transformer<Tuple._14<?>,?> _14 = new Transformer<Tuple._14<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._14<?> source) {
            return source.get_14();
        }
    };
    private static final Transformer<Tuple._15<?>,?> _15 = new Transformer<Tuple._15<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._15<?> source) {
            return source.get_15();
        }
    };
    private static final Transformer<Tuple._16<?>,?> _16 = new Transformer<Tuple._16<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._16<?> source) {
            return source.get_16();
        }
    };
    private static final Transformer<Tuple._17<?>,?> _17 = new Transformer<Tuple._17<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._17<?> source) {
            return source.get_17();
        }
    };
    private static final Transformer<Tuple._18<?>,?> _18 = new Transformer<Tuple._18<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._18<?> source) {
            return source.get_18();
        }
    };
    private static final Transformer<Tuple._19<?>,?> _19 = new Transformer<Tuple._19<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._19<?> source) {
            return source.get_19();
        }
    };
    private static final Transformer<Tuple._20<?>,?> _20 = new Transformer<Tuple._20<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._20<?> source) {
            return source.get_20();
        }
    };
    private static final Transformer<Tuple._21<?>,?> _21 = new Transformer<Tuple._21<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._21<?> source) {
            return source.get_21();
        }
    };
    private static final Transformer<Tuple._22<?>,?> _22 = new Transformer<Tuple._22<?>,Object>() {
        @Override
        public Object transform(fi.solita.utils.functional.Tuple._22<?> source) {
            return source.get_22();
        }
    };
    
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._1<T>,T> _1() {
        return (Transformer<Tuple._1<T>,T>)(Object)_1;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._2<T>,T> _2() {
        return (Transformer<Tuple._2<T>,T>)(Object)_2;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._3<T>,T> _3() {
        return (Transformer<Tuple._3<T>,T>)(Object)_3;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._4<T>,T> _4() {
        return (Transformer<Tuple._4<T>,T>)(Object)_4;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._5<T>,T> _5() {
        return (Transformer<Tuple._5<T>,T>)(Object)_5;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._6<T>,T> _6() {
        return (Transformer<Tuple._6<T>,T>)(Object)_6;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._7<T>,T> _7() {
        return (Transformer<Tuple._7<T>,T>)(Object)_7;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._8<T>,T> _8() {
        return (Transformer<Tuple._8<T>,T>)(Object)_8;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._9<T>,T> _9() {
        return (Transformer<Tuple._9<T>,T>)(Object)_9;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._10<T>,T> _10() {
        return (Transformer<Tuple._10<T>,T>)(Object)_10;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._11<T>,T> _11() {
        return (Transformer<Tuple._11<T>,T>)(Object)_11;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._12<T>,T> _12() {
        return (Transformer<Tuple._12<T>,T>)(Object)_12;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._13<T>,T> _13() {
        return (Transformer<Tuple._13<T>,T>)(Object)_13;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._14<T>,T> _14() {
        return (Transformer<Tuple._14<T>,T>)(Object)_14;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._15<T>,T> _15() {
        return (Transformer<Tuple._15<T>,T>)(Object)_15;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._16<T>,T> _16() {
        return (Transformer<Tuple._16<T>,T>)(Object)_16;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._17<T>,T> _17() {
        return (Transformer<Tuple._17<T>,T>)(Object)_17;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._18<T>,T> _18() {
        return (Transformer<Tuple._18<T>,T>)(Object)_18;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._19<T>,T> _19() {
        return (Transformer<Tuple._19<T>,T>)(Object)_19;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._20<T>,T> _20() {
        return (Transformer<Tuple._20<T>,T>)(Object)_20;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._21<T>,T> _21() {
        return (Transformer<Tuple._21<T>,T>)(Object)_21;
    }
    @SuppressWarnings("unchecked")
    public static final <T> Transformer<Tuple._22<T>,T> _22() {
        return (Transformer<Tuple._22<T>,T>)(Object)_22;
    }
}
