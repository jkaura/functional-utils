package fi.solita.utils.functional;

public abstract class Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> extends MultiParamFunction<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>, R> {

    public abstract R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17);

    public final <U> Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, U> andThen(final Apply<? super R, ? extends U> next) {
        final Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> self = this;
        return new Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, U>() {
            @Override
            public U apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17) {
                return next.apply(self.apply(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17));
            }
        };
    }

    public final Function1<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>, R> tuppled() {
        return new Function1<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>, R>() {
            @Override
            public R apply(Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> t) {
                return Function17.this.apply(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17);
            }
        };
    }
    
    public Function1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, Function1<T8, Function1<T9, Function1<T10, Function1<T11, Function1<T12, Function1<T13, Function1<T14, Function1<T15, Function1<T16, Function1<T17, R>>>>>>>>>>>>>>>>> curried() {
        return new Function1<T1, Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, Function1<T8, Function1<T9, Function1<T10, Function1<T11, Function1<T12, Function1<T13, Function1<T14, Function1<T15, Function1<T16, Function1<T17, R>>>>>>>>>>>>>>>>>() {
            @Override
            public Function1<T2, Function1<T3, Function1<T4, Function1<T5, Function1<T6, Function1<T7, Function1<T8, Function1<T9, Function1<T10, Function1<T11, Function1<T12, Function1<T13, Function1<T14, Function1<T15, Function1<T16, Function1<T17, R>>>>>>>>>>>>>>>> apply(final T1 t1) {
                return new Function16<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R>() {
                    @Override
                    public R apply(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17) {
                        return Function17.this.apply(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
                    }
                }.curried();
            }
        };
    }
    
    public final Function1<T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11, final T12 t12, final T13 t13, T14 t14, T15 t15, T16 t16) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11).ap(t12).ap(t13).ap(t14).ap(t15).ap(t16);
    }
    
    public final Function2<T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11, final T12 t12, final T13 t13, T14 t14, T15 t15) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11).ap(t12).ap(t13).ap(t14).ap(t15);
    }
    
    public final Function3<T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11, final T12 t12, final T13 t13, T14 t14) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11).ap(t12).ap(t13).ap(t14);
    }
    
    public final Function4<T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11, final T12 t12, final T13 t13) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11).ap(t12).ap(t13);
    }
    
    public final Function5<T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11, final T12 t12) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11).ap(t12);
    }
    
    public final Function6<T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10, final T11 t11) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10).ap(t11);
    }
   
    public final Function7<T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9, final T10 t10) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9).ap(t10);
    }
    
    public final Function8<T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8).ap(t9);
    }
    
    public final Function9<T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7).ap(t8);
    }
    
    public final Function10<T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6).ap(t7);
    }
    
    public final Function11<T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5).ap(t6);
    }
    
    public final Function12<T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        return ap(t1).ap(t2).ap(t3).ap(t4).ap(t5);
    }
    
    public final Function13<T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3, final T4 t4) {
        return ap(t1).ap(t2).ap(t3).ap(t4);
    }
    
    public final Function14<T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2, final T3 t3) {
        return ap(t1).ap(t2).ap(t3);
    }
    
    public final Function15<T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t1, final T2 t2) {
        return ap(t1).ap(t2);
    }
    
    public final Function16<T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> ap(final T1 t) {
        return new Function16<T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R>() {
            @Override
            public R apply(T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17) {
                return Function17.this.apply(t, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
            }
        };
    }
    
    static final <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> Function17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R> partial(final Apply<? extends Tuple,R> f, final Object... paramsAndPlaceholders) {
        return new Function17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R>() {
            @SuppressWarnings("unchecked")
            @Override
            public R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17) {
                return PartialApplicationHelper.doApply((Apply<Tuple,R>)f, paramsAndPlaceholders, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
            }
        };
    }
    
    static final <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R,FR extends Apply<?,R>> Function17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,FR> split(final Apply<? extends Tuple,R> f, final Object... placeholders) {
        return new Function17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,FR>() {
            @Override
            public FR apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17) {
                return PartialApplicationHelper.makeSecondFunc(f, placeholders, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
            }
        };
    }
}
