package villanueva.jesus.popcornfactory

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bundle = intent.extras

        var image: ImageView = findViewById(R.id.iv_pelicula_imagen)
        var nombre: TextView = findViewById(R.id.tv_pelicula_nombre)
        var desc: TextView = findViewById(R.id.tv_pelicula_desc)

        if (bundle != null){
            image.setImageResource(bundle.getInt("header"))
            nombre.setText(bundle.getString("titulo"))
            desc.setText(bundle.getString("sinopsis"))
        }

    }
}