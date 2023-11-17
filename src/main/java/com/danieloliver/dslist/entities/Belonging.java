package com.danieloliver.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelogingPk id = new BelogingPk();

    private Integer position;

    

    public Belonging() {
    }


    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setlist(list);
        this.position = position;
    }


    public BelogingPk getId() {
        return this.id;
    }

    public void setId(BelogingPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
    }


}
