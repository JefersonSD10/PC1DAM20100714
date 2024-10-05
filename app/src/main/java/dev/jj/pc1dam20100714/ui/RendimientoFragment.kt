package dev.jj.pc1dam20100714.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import dev.jj.pc1dam20100714.R

class RendimientoFragment : Fragment() {

    private lateinit var kmEditText: EditText
    private lateinit var minEditText: EditText
    private lateinit var resultadoTextView: TextView
    private lateinit var calcularButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        val view = inflater.inflate(R.layout.fragment_rendimiento, container, false)

        // Inicializar componentes
        kmEditText = view.findViewById(R.id.et_km)
        minEditText = view.findViewById(R.id.et_min)
        resultadoTextView = view.findViewById(R.id.tv_resultado)
        calcularButton = view.findViewById(R.id.btn_calcular)

        // Configurar el botón para calcular el rendimiento
        calcularButton.setOnClickListener {
            calcularRendimiento()
        }

        return view
    }

    private fun calcularRendimiento() {
        val km = kmEditText.text.toString().toDoubleOrNull()
        val min = minEditText.text.toString().toDoubleOrNull()

        if (km != null && min != null && min > 0) {
            val rendimiento = km / min
            resultadoTextView.text = "Rendimiento: $rendimiento km/min"
        } else {
            resultadoTextView.text = "Por favor, ingrese valores válidos."
        }
    }
}
