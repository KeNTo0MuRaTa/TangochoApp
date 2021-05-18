package add.murata.muraken.tangoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple, "りんご")
        val banana = Word(R.drawable.banana, "ばなな")
        val orange = Word(R.drawable.orange, "オレンジ")
        val strawberry = Word(R.drawable.strawberry, "イチゴ")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }
    private fun addWord(word:Word){

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(nameTextView)
        layout.addView(imageView)

        container.addView(layout)
    }
}