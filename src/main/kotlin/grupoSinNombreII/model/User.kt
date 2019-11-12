package grupoSinNombreII.model

import java.time.LocalDate
import javax.persistence.*

@Entity
class User(
        var userName: String,
        var email: String,
        var birthday_date: String,
        @ElementCollection
        @ManyToMany(cascade = [CascadeType.ALL], mappedBy = "id")
        var wishlist: MutableSet<Book> = mutableSetOf(),
        @Id @GeneratedValue
        var id: Long = 0
)