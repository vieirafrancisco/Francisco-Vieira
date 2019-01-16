package heranca.q5;

public class RadioRelogio implements Radio, Relogio{
	private String horario;
	private boolean despertar;
	private String horarioAlarme;
	private String emissora;
	private String tipoEmissora;
	private float volumeRadio;
	private float volumeRelogio;
	
	public RadioRelogio(String horario, boolean despertar, String horarioAlarme, String emissora, String tipoEmissora,
			float volumeRadio, float volumeRelogio) {
		super();
		this.horario = horario;
		this.despertar = despertar;
		this.horarioAlarme = horarioAlarme;
		this.emissora = emissora;
		this.tipoEmissora = tipoEmissora;
		this.volumeRadio = volumeRadio;
		this.volumeRelogio = volumeRelogio;
	}

	public void setEmissora(String emissora, String tipoEmissora) {
		this.emissora = emissora;
		this.tipoEmissora = tipoEmissora;
	}
	
	public String getEmissora() {
		return this.emissora;
	}
	
	public String getTipoEmissora() {
		return this.tipoEmissora;
	}
	
	public void setVolumeRadio(float volume) {
		if(volume >= 0 && volume <= 100) {
			this.volumeRadio = volume;
		} else {
			//raise a exception
		}
	}
	
	public float getVolumeRadio() {
		return this.volumeRadio;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public void setHorarioAlarme(String horario) {
		this.horarioAlarme = horario;
	}
	
	public String getHorarioAlarme() {
		return this.horarioAlarme;
	}
	
	public void ligarAlarme() {
		this.despertar = true;
	}
	
	public void desligarAlarme() {
		this.despertar = false;
	}
	
	public void setVolumeRelogio(float volume) {
		if(volume >=0 && volume <= 100) {
			this.volumeRelogio = volume;
		} else {
			//raise a exception
		}
	}
	
	public float getVolumeRelogio() {
		return this.volumeRelogio;
	}
}
