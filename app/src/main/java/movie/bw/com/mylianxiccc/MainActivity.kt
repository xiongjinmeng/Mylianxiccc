package movie.bw.com.mylianxiccc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
        btn.text = stringFromJNI()
        sample_text2.text = jiaFromJNI()
        sample_text3.text = dengFromJNI()
        btn.setOnClickListener {
            var trim1 = edit1.text.toString().trim()
            var trim2 = edit2.text.toString().trim()
            val result = NativeHelper.calculateSum(Integer.parseInt(trim1), Integer.parseInt(trim2))
            sample_text4.setText(result.toString())
        }

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun jiaFromJNI(): String
    external fun dengFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
