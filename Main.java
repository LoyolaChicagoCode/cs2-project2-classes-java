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
    System.out.print(granville.getName());
    System.out.print(" (" + granville.getLine() + " line)");
    System.out.print(" located at ");
    System.out.print(granville.getLatitude());
    System.out.print(",");
    System.out.print(granville.getLongitude());
    System.out.println();

    System.out.print(thorndale.city);
    System.out.print("/");
    System.out.print(thorndale.getName());
    System.out.print(" (" + thorndale.getLine() + " line)");
    System.out.print(" located at ");
    System.out.print(thorndale.getLatitude());
    System.out.print(",");
    System.out.print(thorndale.getLongitude());
    System.out.println();

    granville.fare = 2.75;
    granville.setName("Wilson");

    System.out.println();
    System.out.println(loyola.getName());
    System.out.println(loyola.fare);
    System.out.println();

    System.out.print(inst4.city);
    System.out.print("/");
    System.out.print(inst4.getName());
    System.out.print(" (" + inst4.getLine() + " line)");
    System.out.print(" located at ");
    System.out.print(inst4.getLatitude());
    System.out.print(",");
    System.out.print(inst4.getLongitude());
    System.out.println();

    System.out.println();
    granville.reportStatus("OPEN");
    System.out.println("distance from loop: " + granville.distanceFromLoop() + " degrees");
    granville.relocate(0.012);
    System.out.println("new distance from loop: " + granville.distanceFromLoop() + " degrees");
    granville.changeName();
    System.out.println(granville.getName());
    System.out.println();

    final Station inst5 = new Station();
    inst5.setName("Wilson");
    inst5.setLongitude(inst5.getLongitude() + 0.012);

    System.out.println(inst5.getName());
    System.out.println(Station.city);
    System.out.println(Station.fare);
  }
}