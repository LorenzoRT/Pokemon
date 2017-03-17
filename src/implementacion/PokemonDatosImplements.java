package implementacion;


import java.util.ArrayList;
import pokemongui.Pokemon;



/**
 *
 * @author LOGAN
 */
public class PokemonDatosImplements implements comunicaInterfaz {

    @Override
    public ArrayList<Pokemon> registrarPokemon() {
        Pokemon pokemonDatos = new Pokemon();
    }

     /*@Override
    public ArrayList<Pokemon> registrarPokemon() {
        
        Pokemon pokemon1 = new Pokemon("aaaa", "fuego", 1.23, 1.2, 90, 500, "mamalon", "c:\\");
        ArrayList<Pokemon> pokemonArray = new ArrayList<>();
        
        pokemonArray.add(pokemon1);
        
        return pokemonArray;
    }*/



    /*@Override
    public ArrayList<Pokemon> registrarPokemon() {
        
        
        
        ArrayList<Pokemon> pokemonArray = registrarPokemon();
        Object datoColumna []= new Object[5];
        for (int i = 0; i < pokemonArray.size(); i++) {
            
            datoColumna[0]= pokemonArray.get(i).getPuntosCombate();
            datoColumna[1]= pokemonArray.get(i).getNombre();
            datoColumna[2]= pokemonArray.get(i).getTipo();
            datoColumna[3]= pokemonArray.get(i).getPeso();
            datoColumna[4]= pokemonArray.get(i).getAltura();
    
            
        }
        return pokemonArray;
    }*/
    
 
        
   
}
