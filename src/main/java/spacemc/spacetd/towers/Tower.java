package spacemc.spacetd.towers;

public abstract class Tower {

    Towers tower;
    String name;

    public Tower(Towers towerType, String name) {
        this.tower = towerType;
        this.name = name;
    }

}
