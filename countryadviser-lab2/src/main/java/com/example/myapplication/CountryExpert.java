package com.example.myapplication;

public class CountryExpert {
    String getAnthem(String country) {
        String anthem = "";
        switch (country) {
            case "Seychelles":
                anthem = "Seychelles, our only motherland\n" +
                        "Where we live in harmony\n" +
                        "Happiness, love and peace\n" +
                        "We give thanks to God.";
                break;
            case "Switzerland":
                anthem = "Trittst im Morgenrot daher,\n" +
                        "Seh’ ich dich im Strahlenmeer,\n" +
                        "Dich, du Hocherhabener, Herrlicher!\n" +
                        "Wenn der Alpenfirn sich rötet,";
                break;
            case "Bolivia":
                anthem = "Bolivianos: el hado propicio\n" +
                        "coronó nuestros votos y anhelo.\n" +
                        "Es ya libre, ya libre este suelo,\n" +
                        "ya cesó su servil condición.";
                break;
            case "Denmark":
                anthem = "Der er et yndigt land,\n" +
                        "Det står med brede bøge\n" +
                        "salten østerstrand.\n" +
                        "Det bugter sig i bakke, dal,";
                break;
            case "Italy":
                anthem = "Fratelli d'Italia,\n" +
                        "l'Italia s'è desta,\n" +
                        "dell'elmo di Scipio\n" +
                        "s'è cinta la testa.";
                break;
        }

        return anthem;
    }

    String getCountryIcon(String country) {
        return country;
    }
}
