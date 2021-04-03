package com.rohan.dp.composite.problem.ex2;

/**
 * We’re building an application for an incident management organization. When
 * an incident (eg fire) occurs, one or more teams may be deployed to attack the
 * incident.
 * A team often includes a truck and one or more human resources. It can also
 * include a sub team. For example, for a medium-sized incident, we may need
 * to deploy two teams and each team may contain a truck and two persons.
 * - Team
 *  - Sub Team 1
 *    - Truck
 *    - Human Resource
 *    - Human Resource
 * - Sub Team 2
 *    - Truck
 *    - Human Resource
 *    - Human Resource
 */
public class Main {
  public static void show() {
    var subTeam1 = new Team();
    subTeam1.add(new Truck());
    subTeam1.add(new HumanResource());
    subTeam1.add(new HumanResource());

    var subTeam2 = new Team();
    subTeam2.add(new Truck());
    subTeam2.add(new HumanResource());
    subTeam2.add(new HumanResource());

    var team = new Team();
    team.add(subTeam1);
    team.add(subTeam2);

    team.deploy();
  }
}
