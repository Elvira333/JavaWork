public class help {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Марс", "Нептун", "Венера", "Юпитер", "Марс", "Нептун", "Марс", "Земля", "Меркурий", "Нептун", "Плутон", "Венера", "Марс", "Юпитер", "Земля", "Меркурий","Сатурн", "Уран"));

        int count = 1;
        System.out.println(planets);
        for (int i = 0; i < planets.size()-1; i++) {
            count = 1;
            for (int j = i + 1; j < planets.size(); j++) {

                if (planets.get(i).equals(planets.get(j))) {
//                    planets.remove(planets.get(j));
                    count += 1;
                }
            }
            System.out.printf("Планета %s повторяется %d раз.\n", planets.get(i), count);
//            count = 1;
        }
        System.out.println(planets);
    }
    }
    
}
