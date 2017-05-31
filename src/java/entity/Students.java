/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import entity.Departments;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karthick
 */
@Entity
@Table(name = "students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByStudentid", query = "SELECT s FROM Students s WHERE s.studentid = :studentid")
    , @NamedQuery(name = "Students.findByDepartmentId", query = "SELECT s FROM Students s WHERE s.departmentId = :departmentId")
    , @NamedQuery(name = "Students.findByCreatedat", query = "SELECT s FROM Students s WHERE s.createdat = :createdat")
    , @NamedQuery(name = "Students.findByLastUpdatedAt", query = "SELECT s FROM Students s WHERE s.lastUpdatedAt = :lastUpdatedAt")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Student_id")
    private Integer studentid;
    @Basic(optional = false)
    @Lob
    @Column(name = "Student_name")
    private String studentname;
    @Basic(optional = false)
    @Lob
    @Column(name = "Degree")
    private String degree;
    @Basic(optional = false)
    @Column(name = "department_id")
    private int departmentId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Basic(optional = false)
    @Column(name = "last_updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedAt;
    @Basic(optional = false)
    @Lob
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;
    public Students() {
    }

    public Students(Integer studentid) {
        this.studentid = studentid;
    }

    public Students(Integer studentid, String studentname, String degree, int departmentId, String email, Date createdat, Date lastUpdatedAt, String lastUpdatedBy) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.degree = degree;
        this.departmentId = departmentId;
        this.email = email;
        this.createdat = createdat;
        this.lastUpdatedAt = lastUpdatedAt;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Students[ studentid=" + studentid + " ]";
    }
    
}
