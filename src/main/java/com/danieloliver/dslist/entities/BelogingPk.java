package com.danieloliver.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelogingPk {


    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;

    
    @ManyToOne
    @JoinColumn(name="list_id")
    private GameList list;



    public BelogingPk() {
    }


    public BelogingPk(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }




    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getlist() {
        return this.list;
    }

    public void setlist(GameList list) {
        this.list = list;
    }


    @Override
	public int hashCode() {
		return Objects.hash(game,list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelogingPk other = (BelogingPk) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
    }

} 