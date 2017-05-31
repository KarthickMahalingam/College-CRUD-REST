/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karthick
 */
@Entity
@Table(name = "enrollments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enrollments.findAll", query = "SELECT e FROM Enrollments e")
    , @NamedQuery(name = "Enrollments.findByEnrollId", query = "SELECT e FROM Enrollments e WHERE e.enrollId = :enrollId")
    , @NamedQuery(name = "Enrollments.findByStudentId", query = "SELECT e FROM Enrollments e WHERE e.studentId = :studentId")
    , @NamedQuery(name = "Enrollments.findByCourseId", query = "SELECT e FROM Enrollments e WHERE e.courseId = :courseId")
    , @NamedQuery(name = "Enrollments.findByCreatedAt", query = "SELECT e FROM Enrollments e WHERE e.createdAt = :createdAt")
    , @NamedQuery(name = "Enrollments.findByLastUpdatedAt", query = "SELECT e FROM Enrollments e WHERE e.lastUpdatedAt = :lastUpdatedAt")})
public class Enrollments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enroll_id")
    private Integer enrollId;
    @Basic(optional = false)
    @Column(name = "student_id")
    private int studentId;
    @Basic(optional = false)
    @Column(name = "course_id")
    private int courseId;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "last_updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedAt;

    public Enrollments() {
    }

    public Enrollments(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public Enrollments(Integer enrollId, int studentId, int courseId, Date createdAt, Date lastUpdatedAt) {
        this.enrollId = enrollId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enrollId != null ? enrollId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enrollments)) {
            return false;
        }
        Enrollments other = (Enrollments) object;
        if ((this.enrollId == null && other.enrollId != null) || (this.enrollId != null && !this.enrollId.equals(other.enrollId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Enrollments[ enrollId=" + enrollId + " ]";
    }
    
}
