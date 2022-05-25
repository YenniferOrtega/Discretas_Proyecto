package com.mycompany.discretas_proyecto;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Propiedades {

    public static <T> Consumer<T> withCounterx(BiConsumer<Integer, T> consumer) {
        AtomicInteger counter = new AtomicInteger(0);
        return item -> consumer.accept(counter.getAndIncrement(), item);
    }
    public Boolean reflexiva(int[][] valores){
        for (int i = 0; i < valores.length ; i++) {
            if (valores[i][i] != 1) {
                return false;
            }
        }
        return true;
    }
    public Boolean irreflexiva(int[][] valores){
        for (int i = 0; i <valores.length ; i++) {
            if (valores[i][i] != 0) {
                return false;
            }
        }
        return true;
    }
    public Boolean simetria(int[][] valores) {
        AtomicReference<Boolean> valor = new AtomicReference<>(Boolean.TRUE);
        Arrays.stream(valores).forEach(withCounterx((i, columnas) -> IntStream.range(0, columnas.length).filter(index -> columnas[index] == 1).forEach(j -> {
            if (i != j) {
                if (valores[j][i] == 0) {
                    valor.set(false);
                }
            }
        })));
        return valor.get();
    }
    public Boolean asimetria(int[][] valores) {
        AtomicReference<Boolean> valor = new AtomicReference<>(Boolean.TRUE);
        Arrays.stream(valores).forEach(withCounterx((i, columnas) -> IntStream.range(0, columnas.length).filter(index -> columnas[index] == 1).forEach(j -> {
            if (j!=i){
                if (valores[j][i] == 1) {
                    valor.set(false);
                }
            }else{
                valor.set(false);
            }
        })));
        return valor.get();
    }
    public Boolean antisimetria(int[][] valores) {
        AtomicReference<Boolean> valor = new AtomicReference<>(Boolean.TRUE);
            Arrays.stream(valores).forEach(withCounterx((i, columnas) -> IntStream.range(0, columnas.length).filter(index -> columnas[index] == 1).forEach(j -> {
                if (i!=j){
                    if (valores[j][i] == 1) {
                        valor.set(false);
                    }
                }
            })));
        return valor.get();
    }
    public Boolean transitiva(int[][] valores) {
        AtomicReference<Boolean> valido = new AtomicReference<>(Boolean.FALSE);
        AtomicReference<Boolean> bandera =new AtomicReference<>(Boolean.TRUE);
        Arrays.stream(valores).forEach(withCounterx((i,columnas)-> IntStream.range(0,columnas.length).filter(filtro -> columnas[filtro] == 1).forEach(j->{
            if (IntStream.range(0,valores[j].length).filter(filtro2-> valores[j][filtro2] == 1).toArray().length != 0) {
                IntStream.range(0, valores[j].length).filter(filtro2 -> valores[j][filtro2] == 1).forEach(k->{
                    if ((valores[i][k] == 1) && (valores[i][j] == 1) && (valores[j][k] == 1)){
                        valido.set(true);
                    }else{
                        bandera.set(false);
                    }
                });
            }else {
                bandera.set(false);
            }
            })));
        return valido.get() && bandera.get();
    }
}
