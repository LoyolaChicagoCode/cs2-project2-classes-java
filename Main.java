class Main {
  public static void main(final String[] args) {
    final Station loyola = new Station("Loyola", "RED", 42.0005321, -87.6654555);
    final Station granville = new Station("Granville", "RED", 41.9946956, -87.6648976);
    final Station thorndale = new Station("Thorndale", "RED", 41.9937068, -87.6627518);
    final Station inst4 = granville;

    System.out.print(loyola.city);
    System.out.print("/");
    System.out.print(loyola.getName());
    System.out.print(" (" + loyola.getLine() + " line)");
    System.out.print(" located at ");
    System.out.print(loyola.getLatitude());
    System.out.print(",");
    System.out.print(loyola.getLongitude());
    System.out.println();

    System.out.print(granville.city);
    System.out.print("/");
    System.out.print(granville.name);
    System.out.print(" (" + granville.line + " line)");
    System.out.print(" located at ");
    System.out.print(granville.lat);
    System.out.print(",");
    System.out.print(granville.lon);
    System.out.println();

    System.out.print(thorndale.city);
    System.out.print("/");
    System.out.print(thorndale.name);
    System.out.print(" (" + thorndale.line + " line)");
    System.out.print(" located at ");
    System.out.print(thorndale.lat);
    System.out.print(",");
    System.out.print(thorndale.lon);
    System.out.println();

    granville.fare = 2.75;
    granville.setName("Wilson");

    System.out.println();
    System.out.println(loyola.name);
    System.out.println(loyola.fare);
    System.out.println();

    System.out.print(inst4.city);
    System.out.print("/");
    System.out.print(inst4.name);
    System.out.print(" (" + inst4.line + " line)");
    System.out.print(" located at ");
    System.out.print(inst4.lat);
    System.out.print(",");
    System.out.print(inst4.lon);
    System.out.println();

    System.out.println();
    granville.reportStatus("OPEN");
    System.out.println("distance from loop: " + granville.distanceFromLoop() + " degrees");
    granville.relocate(0.012);
    System.out.println("new distance from loop: " + granville.distanceFromLoop() + " degrees");
    granville.changeName();
    System.out.println(granville.name);
    System.out.println();

    final Station inst5 = new Station();
    inst5.name = "Wilson";
    inst5.lon = inst5.lon + 0.012;

    System.out.println(inst5.name);
    System.out.println(city);
    System.out.println(fare);
  }
}