package fi.solita.utils.functional;


public class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> extends Tuple implements Tuple._1<T1>, Tuple._2<T2>, Tuple._3<T3>, Tuple._4<T4>, Tuple._5<T5>, Tuple._6<T6>, Tuple._7<T7>, Tuple._8<T8>, Tuple._9<T9>, Tuple._10<T10>, Tuple._11<T11> {

    public final T1 _1;
    public final T2 _2;
    public final T3 _3;
    public final T4 _4;
    public final T5 _5;
    public final T6 _6;
    public final T7 _7;
    public final T8 _8;
    public final T9 _9;
    public final T10 _10;
    public final T11 _11;
    
    public Tuple11(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
        this._9 = _9;
        this._10 = _10;
        this._11 = _11;
    }
    
    public <T> Tuple12<T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> prepend(T t) {
        return Tuple.of(t, _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11);
    }
    
    public <T> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T> append(T t) {
        return Tuple.of(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, t);
    }
    
    public Tuple2<T1, T2> take2() {
        return Tuple.of(_1, _2);
    }
    
    public Tuple3<T1, T2, T3> take3() {
        return Tuple.of(_1, _2, _3);
    }
    
    public Tuple4<T1, T2, T3, T4> take4() {
        return Tuple.of(_1, _2, _3, _4);
    }
    
    public Tuple5<T1, T2, T3, T4, T5> take5() {
        return Tuple.of(_1, _2, _3, _4, _5);
    }
    
    public Tuple6<T1, T2, T3, T4, T5, T6> take6() {
        return Tuple.of(_1, _2, _3, _4, _5, _6);
    }
    
    public Tuple7<T1, T2, T3, T4, T5, T6, T7> take7() {
        return Tuple.of(_1, _2, _3, _4, _5, _6, _7);
    }
    
    public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> take8() {
        return Tuple.of(_1, _2, _3, _4, _5, _6, _7, _8);
    }
    
    public Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> take9() {
        return Tuple.of(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }
    
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> take10() {
        return Tuple.of(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    public T1 get_1() {
        return _1;
    }
    
    public T2 get_2() {
        return _2;
    }
    
    public T3 get_3() {
        return _3;
    }
    
    public T4 get_4() {
        return _4;
    }
    
    public T5 get_5() {
        return _5;
    }
    
    public T6 get_6() {
        return _6;
    }
    
    public T7 get_7() {
        return _7;
    }
    
    public T8 get_8() {
        return _8;
    }
    
    public T9 get_9() {
        return _9;
    }
    
    public T10 get_10() {
        return _10;
    }
    
    public T11 get_11() {
        return _11;
    }
    
    @Override
    public Object[] toArray() {
        return new Object[]{_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11};
    }
}
