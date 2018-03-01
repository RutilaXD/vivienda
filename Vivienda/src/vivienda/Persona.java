/*
 * Copyright (C) 2018 Raul
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package vivienda;

/**
 *
 * @author Raul
 */
public class Persona {
    private String nombre;
    private String edoCivil;
    private int edad;

    /**
     *
     * @param nombre
     * @param edoCivil
     * @param edad
     */
    public Persona(String nombre, String edoCivil, int edad) {
        this.nombre = nombre;
        this.edoCivil = edoCivil;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the edoCivil
     */
    public String getEdoCivil() {
        return edoCivil;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
    
}
