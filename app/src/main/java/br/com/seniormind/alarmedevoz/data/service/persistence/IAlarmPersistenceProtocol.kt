package br.com.seniormind.alarmedevoz.data.service.persistence

import br.com.seniormind.alarmedevoz.data.entity.Alarm

interface IAlarmPersistenceProtocol {
    fun getAlarms(): List<Alarm>
    fun saveAlarm(value: Alarm)
    fun removeAlarm(value: Alarm)
}
