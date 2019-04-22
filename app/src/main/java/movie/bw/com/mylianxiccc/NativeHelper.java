package movie.bw.com.mylianxiccc;

/**
 * Created by Administrator on 2019/4/22 0022
 */
public class NativeHelper {
    static {
        System.loadLibrary("native-lib");
    }

    private NativeHelper(){
        //not allow create instance
    }

    //计算两个数之和
    public static native int calculateSum(int number, int other);
}
