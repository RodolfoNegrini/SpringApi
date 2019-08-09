package com.negrini.api.repository.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RcUfs {
	@Id
	@NotNull
	private Integer ufsId;
	@NotNull
	@Size(min = 1, max = 100)
	private String ufsName;
	@NotNull
	@Size(min = 1, max = 2)
	private String ufsSigla;
	@NotNull
	private Date lcadData;
	@NotNull
	private Date lcadHora;
	private Integer ctryId;
	private String userNickname;

}
