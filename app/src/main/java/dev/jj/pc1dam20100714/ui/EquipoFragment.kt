package dev.jj.pc1dam20100714.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import dev.jj.pc1dam20100714.R

class EquipoFragment : Fragment() {

    private lateinit var listView: ListView
    private lateinit var equiposAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        val view = inflater.inflate(R.layout.fragment_equipo, container, false)

        // Inicializar el ListView
        listView = view.findViewById(R.id.list_view_equipos)

        // Crear un arreglo de nombres de equipos de fútbol
        val equipos = listOf("Real Madrid", "Barcelona", "Bayern Múnich", "Manchester United", "Paris Saint-Germain")

        // Configurar el adapter
        equiposAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, equipos)
        listView.adapter = equiposAdapter

        return view
    }
}
