package org.easyml4j.algo;

import lombok.Data;
import org.easyml4j.algo.param.BaseEstimatorParam;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * 估计器，所有算法的基类
 *
 * @author chenxilin
 */
@Data
public abstract class BaseEstimator<Param extends BaseEstimatorParam> {
    /**
     * 算法参数
     */
    private Param param;

    /**
     * 算法训练
     */
    public abstract void fit();

    /**
     * 评分
     *
     * @return INDArray 分数
     */
    public abstract INDArray score();


}
