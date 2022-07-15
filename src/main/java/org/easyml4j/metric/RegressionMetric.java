package org.easyml4j.metric;

import org.easyml4j.exception.DataException;
import org.easyml4j.util.Check;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * 回归评价指标
 *
 * @author chenxilin
 */
public class RegressionMetric extends Metric {

    /**
     * 均方误差
     *
     * @param yTrue 真实的y值，(nSamples,)
     * @param yPred 预测的y值，和yTrue维度一致
     */
    public static Double meanSquaredError(INDArray yTrue, INDArray yPred) throws DataException {
        Check.checkConsistentLength(yTrue, yPred);
        INDArray yTrueSubPred = yTrue.sub(yPred);
        return yTrueSubPred.muli(yTrueSubPred).mean().getDouble(0);
    }

    /**
     * TODO(ysl): 实现maxError（参考sklearn -> metrics -> _regression -> def max_error）并完成文档
     */
    public static Double maxError(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanAbsoluteError
     */
    public static Double meanAbsoluteError(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanSquaredLogError
     */
    public static Double meanSquaredLogError(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现medianAbsoluteError
     */
    public static Double medianAbsoluteError(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanAbsolutePercentageError
     */
    public static Double meanAbsolutePercentageError(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanPinballLoss
     */
    public static Double meanPinballLoss(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现r2Score
     */
    public static Double r2Score(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现explainedVarianceScore
     */
    public static Double explainedVarianceScore(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现explainedVarianceScore
     */
    public static Double meanTweedieDeviance(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanPoissonDeviance
     */
    public static Double meanPoissonDeviance(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

    /**
     * TODO(ysl): 实现meanGammaDeviance
     */
    public static Double meanGammaDeviance(INDArray yTrue, INDArray yPred) throws DataException {
        return null;
    }

}
