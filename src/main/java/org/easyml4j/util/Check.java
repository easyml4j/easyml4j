package org.easyml4j.util;

import org.easyml4j.exception.DataException;
import org.nd4j.linalg.api.ndarray.INDArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenxilin
 */
public class Check {
    /**
     * 检查多个数组的形状是否一致
     */
    public static void checkConsistentLength(INDArray... arrays) throws DataException {
        List<long[]> shapes = Arrays.stream(arrays).map(INDArray::shape).collect(Collectors.toList());
        if (shapes.size() < 2) {
            throw new IllegalArgumentException("至少需要输入两个数组");
        }
        long[] firstShape = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            long[] shape = shapes.get(i);
            if (!Arrays.equals(firstShape, shape)) {
                throw new DataException(String.format("第%s个数组的形状(%s)和第%s个数组(%s)不一致",
                        0, Arrays.toString(firstShape), Arrays.toString(shape), i));
            }
        }
    }
}
