package luxoft.interview02.filesystem;

import java.time.LocalDateTime;

/*
 * TODO - eu não consegui usar esse framework, ficou dando erro e não reconheceu
 *        olhar no arquivo original (zip)
 *        precisa configurar a dependencia do maven no arquivo pom.xml
 *        
 *        as anotations servem para gerar construtor, gets e sets automaticamente e internamente.
 *        
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
*/
public class File {
	
    private long size;
    private String name;
    private LocalDateTime timeCreated;
    private Permissions permission;
    
	public File(long size, String name, LocalDateTime timeCreated, Permissions permission) {
		this.size = size;
		this.name = name;
		this.timeCreated = timeCreated;
		this.permission = permission;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Permissions getPermission() {
		return permission;
	}

	public void setPermission(Permissions permission) {
		this.permission = permission;
	}
    
}
