package br.com.shvy.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
// CRIAR TABELA NO BANCO DE DADOS COM ESSE NOME E OS ATRIBUTOS SERAO OS DA CLASSE
@Entity(name = "tb_tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {

    //DEFINE ID DA TABELA
    @Id
    // COMO ESSE ID SERA GERADO
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private UUID idUser;
    private String description;

    @Column(length = 50)
    private String tittle;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    //DATA ATUAL DE QUANDO FOI CRIADO
    @CreationTimestamp
    private LocalDateTime createdAt;
}
