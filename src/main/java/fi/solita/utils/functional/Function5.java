package fi.solita.utils.functional;

public abstract class Function5<T1, T2, T3, T4, T5, R> extends MultiParamFunction<Tuple5<T1, T2, T3, T4, T5>, R> {

    public abstract R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

    public final <U> Function5<T1, T2, T3, T4, T5, U> andThen(final Apply<? super R, ? extends U> next) {
        final Function5<T1, T2, T3, T4, T5, R> self = this;
        return new Function5<T1, T2, T3, T4, T5, U>() {
            @Override
            public U apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                return next.apply(self.apply(t1, t2, t3, t4, t5));
            }
        };
    }

    public final Function1<Tuple5<T1, T2, T3, T4, T5>, R> tuppled() {
        return new Function1<Tuple5<T1, T2, T3, T4, T5>, R>() {
            @Override
            public R apply(Tuple5<T1, T2, T3, T4, T5> t) {
                return Function5.this.apply(t._1, t._2, t._3, t._4, t._5);
            }
        };
    }
}