package org.webtree.neuralnetwork.test;

import java.io.Serializable;

/**
 * @author Maxim Levicky
 */
public interface Layer extends Serializable {
    /**
     * Получает размер входного вектора
     * @return Размер входного вектора
     */
    int getInputSize();

    /**
     * Получает размер слоя
     * @return Размер слоя
     */
    int getSize();

    /**
     * Вычисляет отклик слоя
     * @param input Входной вектор
     * @return Выходной вектор
     */
    float[] computeOutput(float[] input);
}
