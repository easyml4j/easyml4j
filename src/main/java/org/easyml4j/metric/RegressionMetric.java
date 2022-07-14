package org.easyml4j.metric;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

/**
 * 回归评价指标
 *
 * @author chenxilin
 */
public class RegressionMetric extends Metric {

    /**
     * 均方误差
     *
     * @param yTrue        真实的y值，(nSamples,)或(nSamples, nOutputs)
     * @param yPred        预测的y值，和yTrue维度一致
     * @param sampleWeight 样本权重，(nSamples,)，为null时表示权重相等
     * @param multiOutput  TODO: 具体作用是什么
     */
    public static Double meanSquaredError(INDArray yTrue,
                                          INDArray yPred,
                                          INDArray sampleWeight,
                                          String multiOutput) {
        INDArray yTrueSubPred = yTrue.sub(yPred);
        return yTrueSubPred.muli(yTrueSubPred).mean().getDouble(0);
    }

    public static void main(String[] args) {
        INDArray x = Nd4j.zeros(3);
        INDArray y = Nd4j.ones(3);
        System.out.println(meanSquaredError(x, y, null, null));

//        // 数组的轴数（维度）。
//        int dimensions = x.rank();
//
//        // 数组的维数。每个维度的大小。
//        long[] shape = x.shape();
//
//        // 元素的总数。
//        long length = x.length();
//
//        // 数组元素的类型。
//        DataType dt = x.dataType();
    }
}
