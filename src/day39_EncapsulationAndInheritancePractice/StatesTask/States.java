package day39_EncapsulationAndInheritancePractice.StatesTask;

public class States {
    private String name, abbreviation, politicalParty, Governor, senator;
    private double population, stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Invalid Name" + name);
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Input:" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null) {
            System.err.println("Invalid abreviation" + abbreviation);
            System.exit(1);
        }
        if (abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Invalid Input:" + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null) {
            System.err.println("Invalid politicalParty" + politicalParty);
            System.exit(1);
        }
        if (politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid Input:" + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == null) {
            System.err.println("Invalid governor" + governor);
            System.exit(1);
        }
        if (governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid Input:" + governor);
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null) {
            System.err.println("Invalid senator" + senator);
            System.exit(1);
        }
        if (senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid Input:" + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population <= 0) {
            System.err.println("Invalid Population Input :" + population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax <= 0) {
            System.err.println("Invalid Tax Rate :" + stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }


    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
