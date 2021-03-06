package fi.solita.utils.functional;

import static fi.solita.utils.functional.FunctionalA.concat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public abstract class Collections {
    
    public static final <T> List<T> emptyList() {
        return java.util.Collections.emptyList();
    }
    
    public static final <T> Set<T> emptySet() {
        return java.util.Collections.emptySet();
    }
    
    public static final <K,V> Map<K,V> emptyMap() {
        return java.util.Collections.emptyMap();
    }
    
    public static final <T> Collection<T> emptyCollection() {
        return emptyList();
    }
    
    public static final <T> Queue<T> emptyQueue() {
        return emptyDeque();
    }
    
    public static final <T> Deque<T> emptyDeque() {
        // TODO: make unmodifiable
        return new LinkedList<T>();
    }
    
    public static final <T> List<T> newList() {
        return new ArrayList<T>();
    }
    
    public static final <T> Set<T> newSet() {
        return new HashSet<T>();
    }

    public static final <K, V> Map<K, V> newMap() {
        return new HashMap<K, V>();
    }
    
    public static final <T> Queue<T> newQueue() {
        return new LinkedList<T>();
    }
    
    public static final <T> Deque<T> newDeque() {
        return new LinkedList<T>();
    }
    
    public static final <T> Collection<T> newCollection() {
        return new ArrayList<T>();
    }
    
    public static final <T> List<T> newListOfSize(long initialSize) {
        return new ArrayList<T>((int)initialSize);
    }

    public static final <T> Set<T> newSetOfSize(long initialSize) {
        return new HashSet<T>((int)initialSize);
    }

    public static final <K,V> Map<K,V> newMapOfSize(long initialSize) {
        return new HashMap<K,V>((int)initialSize);
    }
    
    public static final <T> Collection<T> newCollectionOfSize(long initialSize) {
        return new ArrayList<T>((int)initialSize);
    }
    
    public static final List<Boolean> newList(boolean[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Byte> newList(byte[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Character> newList(char[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Double> newList(double[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Float> newList(float[] array) {
        return newList(newArray(array));
    }

    public static final List<Integer> newList(int[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Long> newList(long[] array) {
        return newList(newArray(array));
    }
    
    public static final List<Short> newList(short[] array) {
        return newList(newArray(array));
    }
    
    public static final <T> List<T> newList(T[] elements) {
        return newList(Arrays.asList(elements));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1) {
        return Arrays.asList(e1);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2) {
        return Arrays.asList(e1, e2);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3) {
        return Arrays.asList(e1, e2, e3);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4) {
        return Arrays.asList(e1, e2, e3, e4);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5) {
        return Arrays.asList(e1, e2, e3, e4, e5);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19, T e20) {
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> List<T> newList(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19, T e20, T e21, T... elements) {
        return newList(concat(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21), elements));
    }
    
    public static final Set<Boolean> newSet(boolean[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Byte> newSet(byte[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Character> newSet(char[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Double> newSet(double[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Float> newSet(float[] array) {
        return newSet(newArray(array));
    }

    public static final Set<Integer> newSet(int[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Long> newSet(long[] array) {
        return newSet(newArray(array));
    }
    
    public static final Set<Short> newSet(short[] array) {
        return newSet(newArray(array));
    }
    
    public static final <T> Set<T> newSet(T[] elements) {
        return newSet(Arrays.asList(elements));
    }
    
    public static final <T> Set<T> newSet(T e1) {
        return java.util.Collections.singleton(e1);
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2) {
        return newSet(Arrays.asList(e1, e2));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3) {
        return newSet(Arrays.asList(e1, e2, e3));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4) {
        return newSet(Arrays.asList(e1, e2, e3, e4));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19, T e20) {
        return newSet(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20));
    }
    
    @SuppressWarnings("unchecked")
    public static final <T> Set<T> newSet(T e1, T e2, T e3, T e4, T e5, T e6, T e7, T e8, T e9, T e10, T e11, T e12, T e13, T e14, T e15, T e16, T e17, T e18, T e19, T e20, T e21, T... elements) {
        return newSet(concat(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21), elements));
    }
    
    public static final <T> List<T> newList(Iterable<T> elements) {
        List<T> ret = null;
        for (long size: Iterables.resolveSize.apply(elements)) {
            ret = newListOfSize(size);
        }
        if (ret == null) {
            ret = newList();
        }

        if (elements instanceof Collection) {
            ret.addAll((Collection<? extends T>) elements);
        } else {
            for (T t: elements) {
                ret.add(t);
            }
        }
        return java.util.Collections.unmodifiableList(ret);
    }

    public static final <T> Set<T> newSet(Iterable<T> elements) {
        Set<T> ret = null;
        for (long size: Iterables.resolveSize.apply(elements)) {
            ret = newSetOfSize((int)(size*1.5));
        }
        if (ret == null) {
            ret = newSet();
        }
        if (elements instanceof Collection) {
            ret.addAll((Collection<? extends T>) elements);
        } else {
            for (T t: elements) {
                ret.add(t);
            }
        }
        return java.util.Collections.unmodifiableSet(ret);
    }

    public static final <K, V> Map<K, V> newMap(Iterable<? extends Map.Entry<? extends K, ? extends V>> elements) {
        Map<K, V> ret = null;
        for (long size: Iterables.resolveSize.apply(elements)) {
            ret = newMapOfSize((int)(size*1.5));
        }
        if (ret == null) {
            ret = newMap();
        }
        for (Map.Entry<? extends K, ? extends V> e: elements) {
            ret.put(e.getKey(), e.getValue());
        }
        return java.util.Collections.unmodifiableMap(ret);
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1) {
        return newMap(Arrays.asList(e1));
    }

    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2) {
        return newMap(Arrays.asList(e1, e2));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3) {
        return newMap(Arrays.asList(e1, e2, e3));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4) {
        return newMap(Arrays.asList(e1, e2, e3, e4));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16, Map.Entry<? extends K, ? extends V> e17) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16, Map.Entry<? extends K, ? extends V> e17, Map.Entry<? extends K, ? extends V> e18) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16, Map.Entry<? extends K, ? extends V> e17, Map.Entry<? extends K, ? extends V> e18, Map.Entry<? extends K, ? extends V> e19) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16, Map.Entry<? extends K, ? extends V> e17, Map.Entry<? extends K, ? extends V> e18, Map.Entry<? extends K, ? extends V> e19, Map.Entry<? extends K, ? extends V> e20) {
        return newMap(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20));
    }
    
    @SuppressWarnings("unchecked")
    public static final <K, V> Map<K, V> newMap(Map.Entry<? extends K, ? extends V> e1, Map.Entry<? extends K, ? extends V> e2, Map.Entry<? extends K, ? extends V> e3, Map.Entry<? extends K, ? extends V> e4, Map.Entry<? extends K, ? extends V> e5, Map.Entry<? extends K, ? extends V> e6, Map.Entry<? extends K, ? extends V> e7, Map.Entry<? extends K, ? extends V> e8, Map.Entry<? extends K, ? extends V> e9, Map.Entry<? extends K, ? extends V> e10, Map.Entry<? extends K, ? extends V> e11, Map.Entry<? extends K, ? extends V> e12, Map.Entry<? extends K, ? extends V> e13, Map.Entry<? extends K, ? extends V> e14, Map.Entry<? extends K, ? extends V> e15, Map.Entry<? extends K, ? extends V> e16, Map.Entry<? extends K, ? extends V> e17, Map.Entry<? extends K, ? extends V> e18, Map.Entry<? extends K, ? extends V> e19, Map.Entry<? extends K, ? extends V> e20, Map.Entry<? extends K, ? extends V> e21, Map.Entry<? extends K, ? extends V>... elements) {
        return newMap(concat(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21), elements));
    }
    
    public static final <K, V> Map<K, List<V>> newMultimap(Iterable<? extends Map.Entry<? extends K, ? extends V>> elements) {
        Map<K, List<V>> ret = null;
        for (long size: Iterables.resolveSize.apply(elements)) {
            ret = newMapOfSize((int)(size*1.5));
        }
        if (ret == null) {
            ret = newMap();
        }
        for (Map.Entry<? extends K, ? extends V> e: elements) {
            List<V> values = ret.get(e.getKey());
            if (values == null) {
                values = newList();
                ret.put(e.getKey(), values);
            }
            values.add(e.getValue());
        }
        return java.util.Collections.unmodifiableMap(ret);
    }
    
    public static final Boolean[] newArray(boolean... array) {
        Boolean[] result = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Byte[] newArray(byte... array) {
        Byte[] result = new Byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Character[] newArray(char... array) {
        Character[] result = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Double[] newArray(double... array) {
        Double[] result = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Float[] newArray(float... array) {
        Float[] result = new Float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static final Integer[] newArray(int... array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Long[] newArray(long... array) {
        Long[] result = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final Short[] newArray(short... array) {
        Short[] result = new Short[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final boolean[] newArray(Boolean[] array) {
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final byte[] newArray(Byte[] array) {
        byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final char[] newArray(Character[] array) {
        char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final double[] newArray(Double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final float[] newArray(Float[] array) {
        float[] result = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static final int[] newArray(Integer[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final long[] newArray(Long[] array) {
        long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static final short[] newArray(Short[] array) {
        short[] result = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static final <T> T[] newArray(Class<T> clazz, Iterable<T> elements) {
        List<T> list = newList(elements);
        @SuppressWarnings("unchecked")
        T[] ret = (T[])Array.newInstance(clazz, list.size());
        return list.toArray(ret);
    }
    
    public static final Iterable<Character> it(CharSequence charSeq) {
        return new Iterables.CharSequenceIterable(charSeq);
    }
    
    public static final CharSequence it(Iterable<Character> xs) {
        return new Iterables.MemoizingCharSequenceIterable(xs);
    }
}
