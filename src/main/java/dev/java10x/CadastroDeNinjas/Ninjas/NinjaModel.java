package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_register") // JPA - JAVA PERSISTENCE API
@NoArgsConstructor // Lombok - automatically creates no args constructor
@AllArgsConstructor // Lombok - automatically creates all args constructors
@Data // automatically creates all getters and setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    @ManyToOne // A ninja have just one mission
    @JoinColumn(name = "missions_id") // Foreign key
    private MissionsModel missions;

}
