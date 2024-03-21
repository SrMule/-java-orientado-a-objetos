package tarea3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Javation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el nombre del jugador");
        String nombre = br.readLine();
        Jugador jugador = new Jugador(nombre);
        System.out.println("Bienvenido " + jugador.getNombre());
        System.out.println("Adentrate en este divertido mundo donde podras crear Personas,Edificios y Atracciones e incluso mejorarlas");
        System.out.println("Pero cuidado, los recursos son limitados y por lo tanto tendras que administrarlos de buena manera");
        System.out.println("Si tus javarales (moneda del juego) llegan a ser negativos PIERDES");
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("############ MENU ############");
            System.out.println("1. Comenzar partida");
            System.out.println("2. Editar nombre");
            System.out.println("3. Salir");
            System.out.println("###### Ingresa un numero ######");
            opcion = Integer.parseInt(br.readLine());
            if (opcion == 2) {
                System.out.println("Ingrese el nombre del jugador");
                nombre = br.readLine();
                jugador.setNombre(nombre);
            }

            if (opcion == 1) {
                System.out.println("Preparate " + jugador.getNombre());
                System.out.println("La partida ha comenzado");
                int opcionPartida = 0;
                while (opcionPartida != 9) {
                    System.out.println("##### Recursos #####");
                    System.out.println("# Javarales: " + jugador.getJavalares());
                    System.out.println("# Hierro: " + jugador.getHierro());
                    System.out.println("# Trigo: " + jugador.getTrigo());
                    System.out.println("# Tecnologia: " + jugador.getTecnologia());
                    System.out.println("#####################");
                    System.out.println("############ MENU ############");
                    System.out.println("1. Crear");
                    System.out.println("2. Mejorar");
                    System.out.println("3. Mover una persona a un edificio");
                    System.out.println("4. Sacar una persona de un edificio");
                    System.out.println("5. Mostrar a las personas aun no asignadas");
                    System.out.println("6. Mostrar los edificios construidos y sus habitantes");
                    System.out.println("7. Mostrar las atracciones construidas");
                    System.out.println("8. Terminar el turno");
                    System.out.println("9. Terminar el juego");
                    System.out.println("###### Ingresa un numero ######");
                    opcionPartida = Integer.parseInt(br.readLine());
                    if (opcionPartida == 1) {
                        int opcionCrear = 0;
                        System.out.println("############ ¿Que deseas crear? ############");
                        System.out.println("1. Granjero (coste: 5 javarales)");
                        System.out.println("2. Cientifico (coste: 8 javarales)");
                        System.out.println("3. Herrero (coste: 6 javarales)");
                        System.out.println("4. Granero (coste: 10 javarales, 5 hierro, 5 trigo)");
                        System.out.println("5. Laboratorio (coste: 30 javarales, 10 hierro, 6 tecnologia)");
                        System.out.println("6. Herreria (coste: 20 javarales, 20 hierro)");
                        System.out.println("7. Zona Comun (coste: 15 javarales, 3 hierro, 3 trigo, 3 tecnologia)");
                        System.out.println("8. Feria (coste: 50 javarales, 25 hierro, 25 trigo, 10 tecnologia)");
                        System.out.println("9. Museo (coste: 50 javarales, 30 hierro, 3 trigo, 30 tecnologia)");
                        System.out.println("10. Javapato (coste: 50 javarales, 40 hierro, 20 tecnologia)");
                        System.out.println("###### Ingresa un numero ######");
                        opcionCrear = Integer.parseInt(br.readLine());
                        if (opcionCrear == 1) {
                            if (jugador.getJavalares() >= 5) {
                                String nombreGranjero;
                                System.out.println("¿Como se llamara tu granjero?");
                                nombreGranjero = br.readLine();
                                jugador.setJavalares(jugador.getJavalares() - 5);
                                Persona g = new Granjero(nombreGranjero);
                                jugador.agregar_persona(g);
                                System.out.println("Tu granjero se ha creado correctamente");
                            } else {
                                System.out.println("No se ha podido crear a tu granjero");
                            }

                        } else if (opcionCrear == 2) {
                            if (jugador.getJavalares() >= 8) {
                                String nombreCientifico;
                                System.out.println("¿Como se llamara tu cientifico?");
                                nombreCientifico = br.readLine();
                                jugador.setJavalares(jugador.getJavalares() - 8);
                                Persona c = new Cientifico(nombreCientifico);
                                jugador.agregar_persona(c);
                                System.out.println("Tu cientifico se ha creado correctamente");
                            } else {
                                System.out.println("No se ha podido crear a tu cientifico");
                            }

                        } else if (opcionCrear == 3) {
                            if (jugador.getJavalares() >= 6) {
                                String nombreHerrero;
                                System.out.println("¿Como se llamara tu herrero?");
                                nombreHerrero = br.readLine();
                                jugador.setJavalares(jugador.getJavalares() - 6);
                                Persona h = new Herrero(nombreHerrero);
                                jugador.agregar_persona(h);
                                System.out.println("Tu herrero se ha creado correctamente");
                            } else {
                                System.out.println("No se ha podido crear a tu herrero");
                            }

                        } else if (opcionCrear == 4) {
                            if (jugador.getJavalares() >= 10) {
                                if (jugador.getHierro() >= 5) {
                                    if (jugador.getTrigo() >= 5) {
                                        String nombreGranero;
                                        System.out.println("¿Como se llamara tu granero?");
                                        nombreGranero = br.readLine();
                                        jugador.setJavalares(jugador.getJavalares() - 10);
                                        jugador.setHierro(jugador.getHierro() - 5);
                                        jugador.setTrigo(jugador.getTrigo() - 5);
                                        Edificio g = new Granero(nombreGranero);
                                        jugador.agregar_edificio(g);
                                        System.out.println("Tu granero se ha creado correctamente");
                                    } else {
                                        System.out.println("No se ha podido crear tu granero");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu granero");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu granero");
                            }

                        } else if (opcionCrear == 5) {
                            if (jugador.getJavalares() >= 30) {
                                if (jugador.getHierro() >= 10) {
                                    if (jugador.getTecnologia() >= 6) {
                                        String nombreLaboratorio;
                                        System.out.println("¿Como se llamara tu laboratorio?");
                                        nombreLaboratorio = br.readLine();
                                        jugador.setJavalares(jugador.getJavalares() - 30);
                                        jugador.setHierro(jugador.getHierro() - 10);
                                        jugador.setTecnologia(jugador.getTecnologia() - 6);
                                        Edificio l = new Laboratorio(nombreLaboratorio);
                                        jugador.agregar_edificio(l);
                                        System.out.println("Tu laboratorio se ha creado correctamente");
                                    } else {
                                        System.out.println("No se ha podido crear tu laboratorio");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu laboratorio");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu laboratorio");
                            }

                        } else if (opcionCrear == 6) {
                            if (jugador.getJavalares() >= 20) {
                                if (jugador.getHierro() >= 20) {
                                    String nombreHerreria;
                                    System.out.println("¿Como se llamara tu herreria?");
                                    nombreHerreria = br.readLine();
                                    jugador.setJavalares(jugador.getJavalares() - 20);
                                    jugador.setHierro(jugador.getHierro() - 20);
                                    Edificio h = new Herreria(nombreHerreria);
                                    jugador.agregar_edificio(h);
                                    System.out.println("Tu herreria se ha creado correctamente");
                                } else {
                                    System.out.println("No se ha podido crear tu herreria");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu herreria");
                            }

                        } else if (opcionCrear == 7) {
                            if (jugador.getJavalares() >= 15) {
                                if (jugador.getHierro() >= 3) {
                                    if (jugador.getTrigo() >= 3) {
                                        if (jugador.getTecnologia() >= 3) {
                                            String nombreZonaComun;
                                            System.out.println("¿Como se llamara tu zona comun?");
                                            nombreZonaComun = br.readLine();
                                            jugador.setJavalares(jugador.getJavalares() - 15);
                                            jugador.setHierro(jugador.getHierro() - 3);
                                            jugador.setTrigo(jugador.getTrigo() - 3);
                                            jugador.setTecnologia(jugador.getTecnologia() - 3);
                                            Edificio z = new ZonaComun(nombreZonaComun);
                                            jugador.agregar_edificio(z);
                                            System.out.println("Tu zona comun se ha creado correctamente");
                                        } else {
                                            System.out.println("No se ha podido crear tu zona comun");
                                        }
                                    } else {
                                        System.out.println("No se ha podido crear tu zona comun");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu zona comun");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu zona comun");
                            }

                        } else if (opcionCrear == 8) {
                            if (jugador.getJavalares() >= 50) {
                                if (jugador.getHierro() >= 25) {
                                    if (jugador.getTrigo() >= 25) {
                                        if (jugador.getTecnologia() >= 10) {
                                            String nombreFeria;
                                            System.out.println("¿Como se llamara tu feria?");
                                            nombreFeria = br.readLine();
                                            jugador.setJavalares(jugador.getJavalares() - 50);
                                            jugador.setHierro(jugador.getHierro() - 25);
                                            jugador.setTrigo(jugador.getTrigo() - 25);
                                            jugador.setTecnologia(jugador.getTecnologia() - 10);
                                            Feria f = new Feria(nombreFeria);
                                            jugador.agregar_feria(f);
                                            System.out.println("Tu feria se ha creado correctamente");
                                        } else {
                                            System.out.println("No se ha podido crear tu feria");
                                        }
                                    } else {
                                        System.out.println("No se ha podido crear tu feria");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu feria");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu feria");
                            }

                        } else if (opcionCrear == 9) {
                            if (jugador.getJavalares() >= 50) {
                                if (jugador.getHierro() >= 30) {
                                    if (jugador.getTrigo() >= 3) {
                                        if (jugador.getTecnologia() >= 30) {
                                            String nombreMuseo;
                                            System.out.println("¿Como se llamara tu museo?");
                                            nombreMuseo = br.readLine();
                                            jugador.setJavalares(jugador.getJavalares() - 50);
                                            jugador.setHierro(jugador.getHierro() - 30);
                                            jugador.setTrigo(jugador.getTrigo() - 3);
                                            jugador.setTecnologia(jugador.getTecnologia() - 30);
                                            Museo m = new Museo(nombreMuseo);
                                            jugador.agregar_museo(m);
                                            System.out.println("Tu museo se ha creado correctamente");
                                        } else {
                                            System.out.println("No se ha podido crear tu museo");
                                        }
                                    } else {
                                        System.out.println("No se ha podido crear tu museo");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu museo");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu museo");
                            }

                        } else if (opcionCrear == 10) {
                            if (jugador.getJavalares() >= 50) {
                                if (jugador.getHierro() >= 40) {
                                    if (jugador.getTecnologia() >= 20) {
                                        String nombreJavapato;
                                        System.out.println("¿Como se llamara tu javapato?");
                                        nombreJavapato = br.readLine();
                                        jugador.setJavalares(jugador.getJavalares() - 50);
                                        jugador.setHierro(jugador.getHierro() - 40);
                                        jugador.setTecnologia(jugador.getTecnologia() - 20);
                                        Javapato j = new Javapato(nombreJavapato);
                                        jugador.agregar_javapato(j);
                                        System.out.println("Tu javapato se ha creado correctamente");
                                    } else {
                                        System.out.println("No se ha podido crear tu javapato");
                                    }
                                } else {
                                    System.out.println("No se ha podido crear tu javapato");
                                }
                            } else {
                                System.out.println("No se ha podido crear tu javapato");
                            }
                        }

                    } else if (opcionPartida == 2) {
                        int opcionMejorar = 0;
                        System.out.println("############ ¿Que deseas mejorar? ############");
                        System.out.println("1. Granjero (coste: 15 javarales)");
                        System.out.println("2. Cientifico (coste: 15 javarales)");
                        System.out.println("3. Herrero (coste: 15 javarales)");
                        System.out.println("4. Granero (coste: 20 javarales, 10 hierro, 15 trigo)");
                        System.out.println("5. Laboratorio (coste: 20 javarales, 15 hierro, 10 tecnologia)");
                        System.out.println("6. Herreria (coste: 20 javarales, 20 hierro)");
                        System.out.println("7. Zona Comun (coste: 15 javarales, 10 hierro, 10 trigo, 10 tecnologia)");
                        System.out.println("###### Ingresa un numero ######");
                        opcionMejorar = Integer.parseInt(br.readLine());
                        if (opcionMejorar == 1) {
                            String nombreGranjero;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el granjero?");
                            nombreGranjero = br.readLine();
                            for (int i = 0; i < jugador.getLista_personas().size(); i++) {
                                if (jugador.getLista_personas().get(i).getNombre().equals(nombreGranjero)) {
                                    if (jugador.getJavalares() >= 15) {
                                        jugador.setJavalares(jugador.getJavalares() - 15);
                                        jugador.getLista_personas().get(i).mejorar();
                                        flag = true;
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                    for (int j = 0; j < jugador.getLista_edificios().get(i).getLista_personas()
                                            .size(); j++) {
                                        if (jugador.getLista_edificios().get(j).getLista_personas().get(j).getNombre()
                                                .equals(nombreGranjero)) {
                                            if (jugador.getJavalares() >= 15) {
                                                jugador.setJavalares(jugador.getJavalares() - 15);
                                                jugador.getLista_edificios().get(j).getLista_personas().get(j)
                                                        .mejorar();
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }

                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado al granjero y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado al granjero correctamente");
                            }

                        } else if (opcionMejorar == 2) {
                            String nombreCientifico;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el cientifico?");
                            nombreCientifico = br.readLine();
                            for (int i = 0; i < jugador.getLista_personas().size(); i++) {
                                if (jugador.getLista_personas().get(i).getNombre().equals(nombreCientifico)) {
                                    if (jugador.getJavalares() >= 15) {
                                        jugador.setJavalares(jugador.getJavalares() - 15);
                                        jugador.getLista_personas().get(i).mejorar();
                                        flag = true;
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                    for (int j = 0; j < jugador.getLista_edificios().get(i).getLista_personas()
                                            .size(); j++) {
                                        if (jugador.getLista_edificios().get(j).getLista_personas().get(j).getNombre()
                                                .equals(nombreCientifico)) {
                                            if (jugador.getJavalares() >= 15) {
                                                jugador.setJavalares(jugador.getJavalares() - 15);
                                                jugador.getLista_edificios().get(j).getLista_personas().get(j)
                                                        .mejorar();
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }

                            if (flag == false) {
                                System.out.println("No se ha encontrado al cientifico y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado al cientifico correctamente");
                            }

                        } else if (opcionMejorar == 3) {
                            String nombreHerrero;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el herrero?");
                            nombreHerrero = br.readLine();
                            for (int i = 0; i < jugador.getLista_personas().size(); i++) {
                                if (jugador.getLista_personas().get(i).getNombre().equals(nombreHerrero)) {
                                    if (jugador.getJavalares() >= 15) {
                                        jugador.setJavalares(jugador.getJavalares() - 15);
                                        jugador.getLista_personas().get(i).mejorar();
                                        flag = true;
                                    }
                                }
                            }

                            if (flag.equals(false)) {
                                for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                    for (int j = 0; j < jugador.getLista_edificios().get(i).getLista_personas()
                                            .size(); j++) {
                                        if (jugador.getLista_edificios().get(j).getLista_personas().get(j).getNombre()
                                                .equals(nombreHerrero)) {
                                            if (jugador.getJavalares() >= 15) {
                                                jugador.setJavalares(jugador.getJavalares() - 15);
                                                jugador.getLista_edificios().get(j).getLista_personas().get(j)
                                                        .mejorar();
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }

                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado al herrero y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado al herrero correctamente");
                            }

                        } else if (opcionMejorar == 4) {
                            String nombreGranero;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el granero?");
                            nombreGranero = br.readLine();
                            for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                if (jugador.getLista_edificios().get(i).getNombre().equals(nombreGranero)) {
                                    if (jugador.getJavalares() >= 20) {
                                        if (jugador.getHierro() >= 10) {
                                            if (jugador.getTrigo() >= 15) {
                                                jugador.setJavalares(jugador.getJavalares() - 20);
                                                jugador.setHierro(jugador.getHierro() - 10);
                                                jugador.setTrigo(jugador.getTrigo() - 15);
                                                jugador.getLista_edificios().get(i).mejorar();
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado al granero y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado al granero correctamente");
                            }

                        } else if (opcionMejorar == 5) {
                            String nombreLaboratorio;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el laboratorio?");
                            nombreLaboratorio = br.readLine();
                            for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                if (jugador.getLista_edificios().get(i).getNombre().equals(nombreLaboratorio)) {
                                    if (jugador.getJavalares() >= 20) {
                                        if (jugador.getHierro() >= 15) {
                                            if (jugador.getTecnologia() >= 10) {
                                                jugador.setJavalares(jugador.getJavalares() - 20);
                                                jugador.setHierro(jugador.getHierro() - 15);
                                                jugador.setTecnologia(jugador.getTecnologia() - 10);
                                                jugador.getLista_edificios().get(i).mejorar();
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado al laboratorio y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado al laboratorio correctamente");
                            }

                        } else if (opcionMejorar == 6) {
                            String nombreHerreria;
                            Boolean flag = false;
                            System.out.println("¿Como se llama el herreria?");
                            nombreHerreria = br.readLine();
                            for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                if (jugador.getLista_edificios().get(i).getNombre().equals(nombreHerreria)) {
                                    if (jugador.getJavalares() >= 20) {
                                        if (jugador.getHierro() >= 20) {
                                            jugador.setJavalares(jugador.getJavalares() - 20);
                                            jugador.setHierro(jugador.getHierro() - 20);
                                            jugador.getLista_edificios().get(i).mejorar();
                                            flag = true;
                                        }
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado la herreria y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado la herreria correctamente");
                            }

                        } else if (opcionMejorar == 7) {
                            String nombreZonaComun;
                            Boolean flag = false;
                            System.out.println("¿Como se llama la zona comun?");
                            nombreZonaComun = br.readLine();
                            for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                if (jugador.getLista_edificios().get(i).getNombre().equals(nombreZonaComun)) {
                                    if (jugador.getJavalares() >= 15) {
                                        if (jugador.getHierro() >= 10) {
                                            if (jugador.getTrigo() >= 10) {
                                                if (jugador.getTecnologia() >= 10) {
                                                    jugador.setJavalares(jugador.getJavalares() - 15);
                                                    jugador.setHierro(jugador.getHierro() - 10);
                                                    jugador.setTrigo(jugador.getTrigo() - 10);
                                                    jugador.setTecnologia(jugador.getTecnologia() - 10);
                                                    jugador.getLista_edificios().get(i).mejorar();
                                                    flag = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (flag.equals(false)) {
                                System.out.println(
                                        "No se ha encontrado la zona comun y/o no tienes los recursos suficientes");
                            } else {
                                System.out.println("Se ha mejorado la zona comun correctamente");
                            }
                        }

                    } else if (opcionPartida == 3) {
                        String nombrePersona;
                        String nombreEdificio;
                        Boolean flag = false;
                        Persona Mov;
                        System.out.println("¿Como se llama la persona que deseas mover?");
                        nombrePersona = br.readLine();
                        for (int i = 0; i < jugador.getLista_personas().size(); i++) {
                            if (jugador.getLista_personas().get(i).getNombre().equals(nombrePersona)) {
                                System.out.println("¿Como se llama el edificio al que deseas mover la persona?");
                                nombreEdificio = br.readLine();
                                for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                                    if (jugador.getLista_edificios().get(j).getNombre().equals(nombreEdificio)) {
                                        if (jugador.getLista_edificios().get(j).getCapacidad() > jugador
                                                .getLista_edificios().get(j).getLista_personas().size()) {
                                            Mov = jugador.getLista_personas().get(i);
                                            jugador.sacar_persona(Mov.getNombre());
                                            jugador.getLista_edificios().get(j).agregar_persona(Mov);
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (flag.equals(true)) {
                            System.out.println("Se ha movido correctamente a la persona");
                        } else {
                            System.out.println("La persona y/o el edificio no existe o el edificio esta lleno");
                        }

                    } else if (opcionPartida == 4) {
                        String nombrePersona;
                        String nombreEdificio;
                        Boolean flag = false;
                        Persona Mov;
                        System.out.println("¿Como se llama el edifico del que quieres sacar a la persona?");
                        nombreEdificio = br.readLine();
                        for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                            if (jugador.getLista_edificios().get(j).getNombre().equals(nombreEdificio)) {
                                System.out.println("¿Como se llama la persona que deseas mover?");
                                nombrePersona = br.readLine();
                                for (int i = 0; i < jugador.getLista_edificios().get(j).getLista_personas()
                                        .size(); i++) {
                                    if (jugador.getLista_edificios().get(j).getLista_personas().get(i).getNombre()
                                            .equals(nombrePersona)) {
                                        Mov = jugador.getLista_edificios().get(j).getLista_personas().get(i);
                                        jugador.getLista_edificios().get(j).sacar_persona(Mov.getNombre());
                                        jugador.agregar_persona(Mov);
                                        flag = true;
                                    }
                                }
                            }
                        }
                        if (flag.equals(true)) {
                            System.out.println("Se ha movido correctamente a la persona");
                        } else {
                            System.out.println("La persona y/o el edificio no existe");
                        }

                    } else if (opcionPartida == 5) {
                        System.out.println("############ Personas no asignadas a un edificio ############");
                        if (jugador.getLista_personas().size() == 0) {
                            System.out.println("No hay personas sin asignar");
                        } else {
                            for (int i = 0; i < jugador.getLista_personas().size(); i++) {
                                System.out.println("----------------------------");
                                System.out.println("Nombre: " + jugador.getLista_personas().get(i).getNombre());
                                if (jugador.getLista_personas().get(i).es_granjero() == 1) {
                                    System.out.println("Oficio: Granjero");
                                }
                                if (jugador.getLista_personas().get(i).es_herrero() == 1) {
                                    System.out.println("Oficio: Herrero");
                                } 
                                if (jugador.getLista_personas().get(i).es_cientifico() == 1) {
                                    System.out.println("Oficio: Cientifico");
                                }
                                System.out.println("Edad: " + jugador.getLista_personas().get(i).getEdad());
                                System.out.println("Nivel: " + jugador.getLista_personas().get(i).getNivel());
                                System.out.println(
                                        "Productividad: " + jugador.getLista_personas().get(i).getProductividad());
                                System.out.println("----------------------------");
                            }
                        }

                    } else if (opcionPartida == 6) {
                        System.out.println("############ Edificios construidos ############");
                        if (jugador.getLista_edificios().size() == 0) {
                            System.out.println("No hay edificios construidos");
                        } else {
                            for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Nombre: " + jugador.getLista_edificios().get(i).getNombre());
                                if (jugador.getLista_edificios().get(i).es_granero() == 1) {
                                    System.out.println("Tipo: Granero");
                                }
                                if (jugador.getLista_edificios().get(i).es_herreria() == 1) {
                                    System.out.println("Tipo: Herreria");
                                }
                                if (jugador.getLista_edificios().get(i).es_laboratorio() == 1) {
                                    System.out.println("Tipo: Laboratorio");
                                }
                                if (jugador.getLista_edificios().get(i).es_zonaComun() == 1) {
                                    System.out.println("Tipo: Zona Comun");
                                }
                                System.out.println("Nivel: " + jugador.getLista_edificios().get(i).getNivel());
                                System.out.println("Capacidad: " + jugador.getLista_edificios().get(i).getCapacidad());
                                for (int j = 0; j < jugador.getLista_edificios().get(i).getLista_personas().size(); j++) {
                                    System.out.println("----------------------------");
                                    System.out.println("Nombre: " + jugador.getLista_edificios().get(i).getLista_personas().get(j).getNombre());
                                    if (jugador.getLista_edificios().get(i).getLista_personas().get(j).es_granjero() == 1) {
                                        System.out.println("Oficio: Granjero");
                                    }
                                    if (jugador.getLista_edificios().get(i).getLista_personas().get(j).es_herrero() == 1) {
                                        System.out.println("Oficio: Herrero");
                                    }
                                    if (jugador.getLista_edificios().get(i).getLista_personas().get(j).es_cientifico() == 1) {
                                        System.out.println("Oficio: Cientifico");
                                    }
                                    System.out.println("Edad: "+ jugador.getLista_edificios().get(i).getLista_personas().get(j).getEdad());
                                    System.out.println("Nivel: " + jugador.getLista_edificios().get(i).getLista_personas().get(j).getNivel());
                                    System.out.println("Productividad: " + jugador.getLista_edificios().get(i).getLista_personas().get(j).getProductividad());
                                    System.out.println("----------------------------");
                                }
                                System.out.println("--------------------------------------------------");
                            }
                        }

                    } else if (opcionPartida == 7) {
                        System.out.println("############ Atracciones construidas ############");
                        int cantidad = 0;
                        for (int i = 0; i < jugador.getLista_ferias().size(); i++) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Nombre: " + jugador.getLista_ferias().get(i).getNombre());
                            System.out.println("Tipo: Feria");
                            cantidad++;
                            System.out.println("--------------------------------------------------");
                        }
                        for (int i = 0; i < jugador.getLista_museos().size(); i++) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Nombre: " + jugador.getLista_museos().get(i).getNombre());
                            System.out.println("Tipo: Museo");
                            cantidad++;
                            System.out.println("--------------------------------------------------");
                        }
                        for (int i = 0; i < jugador.getLista_javapatos().size(); i++) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Nombre: " + jugador.getLista_javapatos().get(i).getNombre());
                            System.out.println("Tipo: Javapato");
                            cantidad++;
                            System.out.println("--------------------------------------------------");
                        }
                        if (cantidad == 0) {
                            System.out.println("No hay atracciones construidas");
                        }

                    } else if (opcionPartida == 8) {
                        System.out.println("Turno terminado");
                        int javarales = 0;
                        int hierro = 0;
                        int trigo = 0;
                        int tecnologia = 0;
                        int javaralesTotales = 0;
                        for (int i = 0; i < jugador.getLista_edificios().size(); i++) {
                            List<Integer> produccion;
                            produccion = jugador.getLista_edificios().get(i).producir();
                            System.out.println("Tu edificio " + jugador.getLista_edificios().get(i).getNombre() + " ha producido:");
                            jugador.setJavalares(jugador.getJavalares() + produccion.get(0));
                            javarales += produccion.get(0);
                            System.out.println(produccion.get(0) + " javarales");
                            jugador.setHierro(jugador.getHierro() + produccion.get(1));
                            hierro += produccion.get(1);
                            System.out.println(produccion.get(1) + " hierro");
                            jugador.setTrigo(jugador.getTrigo() + produccion.get(2));
                            trigo += produccion.get(2);
                            System.out.println(produccion.get(2) + " trigo");
                            jugador.setTecnologia(jugador.getTecnologia() + produccion.get(3));
                            tecnologia += produccion.get(3);
                            System.out.println(produccion.get(3) + " tecnologia");
                        }
                        System.out.println("Tus edificios han producido en total: " + javarales + " javarales, " + hierro + " hierro, " + trigo + " trigo y " + tecnologia + " tecnologia.");
                        for (int i = 0; i < jugador.getLista_ferias().size(); i++) {
                            javarales = 0;
                            List<Persona> lista_personas;
                            lista_personas = new ArrayList<Persona>();
                            for (int j = 0; j < jugador.getLista_personas().size(); j++) {
                                lista_personas.add(jugador.getLista_personas().get(j));
                            }
                            for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                                for (int k = 0; k < jugador.getLista_edificios().get(j).getLista_personas().size(); k++) {
                                    lista_personas.add(jugador.getLista_edificios().get(j).getLista_personas().get(k));
                                }
                            }
                            javarales = jugador.getLista_ferias().get(i).visitar(lista_personas);
                            System.out.println("Tu Feria " + jugador.getLista_ferias().get(i).getNombre() + " ha producido:");
                            System.out.println(javarales + " javarales");
                            javaralesTotales += javarales;
                            jugador.setJavalares(jugador.getJavalares() + javarales);
                        }
                        System.out.println("Tus ferias han producido en total: " + javaralesTotales + " javarales.");
                        javaralesTotales = 0;
                        for (int i = 0; i < jugador.getLista_museos().size(); i++) {
                            javarales = 0;
                            List<Persona> lista_personas;
                            lista_personas = new ArrayList<Persona>();
                            for (int j = 0; j < jugador.getLista_personas().size(); j++) {
                                lista_personas.add(jugador.getLista_personas().get(j));
                            }
                            for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                                for (int k = 0; k < jugador.getLista_edificios().get(j).getLista_personas()
                                        .size(); k++) {
                                    lista_personas.add(jugador.getLista_edificios().get(j).getLista_personas().get(k));
                                }
                            }
                            javarales = jugador.getLista_museos().get(i).visitar(lista_personas);
                            System.out.println("Tu Museo " + jugador.getLista_ferias().get(i).getNombre() + " ha producido:");
                            System.out.println(javarales + " javarales");
                            javaralesTotales += javarales;
                            jugador.setJavalares(jugador.getJavalares() + javarales);
                        }
                        System.out.println("Tus museos han producido en total: " + javaralesTotales + " javarales.");
                        javaralesTotales = 0;
                        for (int i = 0; i < jugador.getLista_javapatos().size(); i++) {
                            javarales = 0;
                            List<Persona> lista_personas;
                            lista_personas = new ArrayList<Persona>();
                            for (int j = 0; j < jugador.getLista_personas().size(); j++) {
                                lista_personas.add(jugador.getLista_personas().get(j));
                            }
                            for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                                for (int k = 0; k < jugador.getLista_edificios().get(j).getLista_personas()
                                        .size(); k++) {
                                    lista_personas.add(jugador.getLista_edificios().get(j).getLista_personas().get(k));
                                }
                            }
                            javarales = jugador.getLista_javapatos().get(i).visitar(lista_personas);
                            System.out.println("Tu Javapato " + jugador.getLista_ferias().get(i).getNombre() + " ha producido:");
                            System.out.println(javarales + " javarales");
                            javaralesTotales += javarales;
                            jugador.setJavalares(jugador.getJavalares() + javarales);
                        }
                        System.out.println("Tus javapatos han producido en total: " + javaralesTotales + " javarales.");
                        javaralesTotales = 0;
                        int contadorMuertes = 0;
                        System.out.println("// Fallecimientos reportados //");
                        for (int j = 0; j < jugador.getLista_personas().size(); j++) {
                            jugador.getLista_personas().get(j).envejecer();
                            if (jugador.getLista_personas().get(j).getEdad() > 30) {
                                System.out.println(jugador.getLista_personas().get(j).getNombre() + " ha muerto, que en paz descanse");
                                jugador.sacar_persona(jugador.getLista_personas().get(j).getNombre());
                                contadorMuertes += 1;
                            }
                        }
                        for (int j = 0; j < jugador.getLista_edificios().size(); j++) {
                            for (int k = 0; k < jugador.getLista_edificios().get(j).getLista_personas().size(); k++) {
                                jugador.getLista_edificios().get(j).getLista_personas().get(k).envejecer();
                                if (jugador.getLista_edificios().get(j).getLista_personas().get(k).getEdad() > 30) {
                                    System.out.println(jugador.getLista_edificios().get(j).getLista_personas().get(k).getNombre() + " ha muerto, que en paz descanse");
                                    jugador.getLista_edificios().get(j).sacar_persona(jugador.getLista_edificios().get(j).getLista_personas().get(k).getNombre());
                                    contadorMuertes += 1;
                                }
                            }
                        }
                        if (contadorMuertes == 0) {
                            System.out.println("No se ha reportado ninguna muerte durante este turno");
                        }
                        if (jugador.getJavalares() < 0) {
                            System.out.println("##### Recursos #####");
                            System.out.println("# Javarales: " + jugador.getJavalares());
                            System.out.println("# Hierro: " + jugador.getHierro());
                            System.out.println("# Trigo: " + jugador.getTrigo());
                            System.out.println("# Tecnologia: " + jugador.getTecnologia());
                            System.out.println("#####################");
                            System.out.println("Tus javarales han quedado en negativo");
                            System.out.println("Has perdido");
                            System.out.println("Juego terminado");
                            opcionPartida = 9;
                        }
                    } else if (opcionPartida == 9) {
                        System.out.println("Juego terminado");
                    }
                }
            }
        }
        System.out.println("Has salido del juego");
    br.close();
    }
}
