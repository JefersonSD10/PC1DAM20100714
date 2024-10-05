package dev.jj.pc1dam20100714.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.jj.pc1dam20100714.R

class JugadoresAdapter(private val jugadores: List<Jugador>) : RecyclerView.Adapter<JugadoresAdapter.JugadorViewHolder>() {

    class JugadorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagenImageView: ImageView = view.findViewById(R.id.iv_imagen)
        val nombreTextView: TextView = view.findViewById(R.id.tv_nombre)
        val anioTextView: TextView = view.findViewById(R.id.tv_anio)
        val edadTextView: TextView = view.findViewById(R.id.tv_edad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_jugador, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = jugadores[position]
        holder.imagenImageView.setImageResource(jugador.imagenResId)
        holder.nombreTextView.text = jugador.nombreCompleto
        holder.anioTextView.text = "Año de Nacimiento: ${jugador.anioNacimiento}"
        holder.edadTextView.text = "Edad: ${jugador.edad}"
    }

    override fun getItemCount(): Int = jugadores.size
}
