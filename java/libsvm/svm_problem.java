package libsvm;

public class svm_problem implements java.io.Serializable
{
	public int l;
	public double[] y;
	public svm_node[][] x;

  public svm_problem() {
    svm_parameter param = new svm_parameter();
    // default values
    param.svm_type = svm_parameter.C_SVC;
    param.kernel_type = svm_parameter.RBF;
    param.degree = 3;
    param.gamma = 0;	// 1/num_features
    param.coef0 = 0;
    param.nu = 0.5;
    param.cache_size = 100;
    param.C = 1;
    param.eps = 1e-3;
    param.p = 0.1;
    param.shrinking = 1;
    param.probability = 1; // changed this to 1 as our current way of predicting the regressions rely on it to compute expectation.
    param.nr_weight = 0;
    param.weight_label = new int[0];
    param.weight = new double[0];
  }
}
