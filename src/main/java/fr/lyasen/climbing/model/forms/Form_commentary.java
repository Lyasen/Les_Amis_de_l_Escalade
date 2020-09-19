package fr.lyasen.climbing.model.forms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commentaries_on_site")
public class Form_commentary {
    @Id
    @Column(name = "commentary_id", nullable = false, columnDefinition = "INT UNSIGNED AUTO_INCREMENT")
    private int commentaryId;
    @Column(name = "commentaries", nullable = false, columnDefinition = "TEXT NOT NULL")
    private String commentaries;

    public Form_commentary(){}

    public Form_commentary(int commentaryId, String commentaries) {
        this.commentaryId = commentaryId;
        this.commentaries = commentaries;
    }

    public int getCommentaryId() {
        return commentaryId;
    }

    public void setCommentaryId(int commentaryId) {
        this.commentaryId = commentaryId;
    }

    public String getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(String commentaries) {
        this.commentaries = commentaries;
    }
}
