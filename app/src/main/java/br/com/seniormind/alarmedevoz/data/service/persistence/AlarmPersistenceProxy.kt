package br.com.seniormind.alarmedevoz.data.service.persistence

import br.com.seniormind.alarmedevoz.data.entity.Alarm

class AlarmPersistenceProxy(
    private val alarmPersistenceProtocol: IAlarmPersistenceProtocol
): IAlarmPersistenceProtocol {

    override fun getAlarms(): List<Alarm> {
        return alarmPersistenceProtocol.getAlarms()
    }

    override fun saveAlarm(value: Alarm) {
        alarmPersistenceProtocol.saveAlarm(value)
    }

    override fun removeAlarm(value: Alarm) {
        alarmPersistenceProtocol.removeAlarm(value)
    }
}