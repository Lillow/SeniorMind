package br.com.seniormind.alarmedevoz.data.service.persistence

import android.content.SharedPreferences
import br.com.seniormind.alarmedevoz.data.entity.Alarm
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.hawk.Hawk

class AlarmPersistence(
    private val sharedPreferences: SharedPreferences
): IAlarmPersistenceProtocol {

    override fun getAlarms(): List<Alarm> {
        val alarmsJson = sharedPreferences.getString(DataPersistenceConstants.ALARM_LIST, "[]")
        val typeList = object : TypeToken<ArrayList<Alarm>>() {}.type
        return Gson().fromJson(alarmsJson, typeList)
    }

    override fun saveAlarm(value: Alarm) {
        val alarms = getAlarms() as MutableList<Alarm>
        alarms.add(value)
        val alarmsJson = Gson().toJson(alarms)

        with(sharedPreferences.edit()) {
            putString(DataPersistenceConstants.ALARM_LIST, alarmsJson)
            apply()
        }
    }

    override fun removeAlarm(value: Alarm) {
        val alarms = getAlarms() as MutableList<Alarm>
        with(alarms) {
            val alarm = find { it.equals(value) }
            remove(alarm)
        }

        val alarmsJson = Gson().toJson(alarms)

        with(sharedPreferences.edit()) {
            putString(DataPersistenceConstants.ALARM_LIST, alarmsJson)
            apply()
        }
    }
}