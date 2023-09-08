import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.segurasayra.myapplication.R

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var num1 = 0.0
    private var num2 = 0.0
    private var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.TextView)
    }

    fun onNumberClick(view: View) {
        val button = view as Button
        val currentText = textView.text.toString()
        val buttonText = button.text.toString()

        textView.text = "$currentText$buttonText"
    }

    fun onOperatorClick(view: View) {
        val button = view as Button
        operator = button.text.toString()
        num1 = textView.text.toString().toDouble()
        textView.text = ""
    }

    fun onEqualClick(view: View) {
        num2 = textView.text.toString().toDouble()
        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else Double.NaN
            else -> Double.NaN
        }
        textView.text = result.toString()
        operator = ""
    }

    fun onClearClick(view: View) {
        textView.text = ""
        num1 = 0.0
        num2 = 0.0
        operator = ""
    }
}
