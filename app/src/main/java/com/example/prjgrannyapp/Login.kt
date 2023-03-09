package com.example.prjgrannyapp

class Login {
    private var aName = ArrayList<String>()//("John", "Jane", "Bob")

    private var aPassword = ArrayList<String>()//("John", "Jane", "Bob")
    fun AddOldUsers()
    {
        aName.add("Granny")
        aPassword.add("Tim")
        aName.add("Granpa")
        aPassword.add("Timmy")
        aName.add("Timmy")
        aPassword.add("Garnny")
    }
     fun AddNewUser(Name :String,Password:String)
     {
        aName.add(Name)
         aPassword.add(Password)
    }
    public fun checkUser(Name :String,Password:String):Boolean
    {
        var bLoop =false
        for (i in 0 .. aName.size)
        {
            if ((aPassword[i].equals(Password))&&(aName[i].equals(Name)))
            {
                bLoop=true
            }
        }
        return bLoop
    }
    fun AddUserName(Name :String)
    {
        aName.add(Name)
    }
    fun AddPassword(Password :String)
    {
        aPassword.add(Password)
    }

}