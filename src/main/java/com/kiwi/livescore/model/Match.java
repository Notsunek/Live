package com.kiwi.livescore.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Match extends IdEntity {

    private LocalDate startDate;

    @OneToOne
    private Competitor competitorHome;

    @OneToOne
    private Competitor competitorAway;

    private int scoreHome;
    private int scoreAway;

    @ManyToOne
    private Tournament tournament;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Competitor getCompetitorHome() {
        return competitorHome;
    }

    public void setCompetitorHome(Competitor competitorHome) {
        this.competitorHome = competitorHome;
    }

    public Competitor getCompetitorAway() {
        return competitorAway;
    }

    public void setCompetitorAway(Competitor competitorAway) {
        this.competitorAway = competitorAway;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}
