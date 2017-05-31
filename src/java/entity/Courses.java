/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karthick
 */
@Entity
@Table(name = "courses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c")
    , @NamedQuery(name = "Courses.findByCourseId", query = "SELECT c FROM Courses c WHERE c.courseId = :courseId")
    , @NamedQuery(name = "Courses.findByDepartmentId", query = "SELECT c FROM Courses c WHERE c.departmentId = :departmentId")
    , @NamedQuery(name = "Courses.findByCreatedat", query = "SELECT c FROM Courses c WHERE c.createdat = :createdat")
    , @NamedQuery(name = "Courses.findByLastUpdatedAt", query = "SELECT c FROM Courses c WHERE c.lastUpdatedAt = :lastUpdatedAt")})
public class Courses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "course_id")
    private Integer courseId;
    @Basic(optional = false)
    @Lob
    @Column(name = "course_name")
    private String courseName;
    @Basic(optional = false)
    @Column(name = "department_id")
    private int departmentId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Instructor")
    private String instructor;
    @Basic(optional = false)
    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Basic(optional = false)
    @Column(name = "last_updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedAt;
    @OneToMany
	@JoinTable(name = "departments", 
		joinColumns = @JoinColumn(name = "department_id", referencedColumnName = "department_id"))
	private Set<Departments> people = new HashSet<Departments>();
    public Courses() {
    }

    public Courses(Integer courseId) {
        this.courseId = courseId;
    }

    public Courses(Integer courseId, String courseName, int departmentId, String instructor, Date createdat, Date lastUpdatedAt) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.departmentId = departmentId;
        this.instructor = instructor;
        this.createdat = createdat;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
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
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Courses[ courseId=" + courseId + " ]";
    }

   
    
    
    
}
