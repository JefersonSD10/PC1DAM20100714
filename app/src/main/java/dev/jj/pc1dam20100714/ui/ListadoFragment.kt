import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jj.pc1dam20100714.R
import dev.jj.pc1dam20100714.ui.Jugador
import dev.jj.pc1dam20100714.ui.JugadoresAdapter

class ListadoFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var jugadoresAdapter: JugadoresAdapter
    private lateinit var jugadoresList: List<Jugador>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        val view = inflater.inflate(R.layout.fragment_listado, container, false)

        // Configurar el RecyclerView
        recyclerView = view.findViewById(R.id.recycler_view_jugadores)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Crear la lista de jugadores
        jugadoresList = listOf(
            Jugador("Lionel Messi", "1987", calcularEdad(1987), R.drawable.messi),
            Jugador("Cristiano Ronaldo", "1985", calcularEdad(1985), R.drawable.ronaldo),
            Jugador("Kylian Mbappé", "1998", calcularEdad(1998), R.drawable.mbappe)
        )

        // Configurar el adapter
        jugadoresAdapter = JugadoresAdapter(jugadoresList)
        recyclerView.adapter = jugadoresAdapter

        return view
    }

    private fun calcularEdad(anioNacimiento: Int): Int {
        val currentYear = 2024 // O usar Calendar.getInstance().get(Calendar.YEAR)
        return currentYear - anioNacimiento
    }
}
