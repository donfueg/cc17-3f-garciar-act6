package com.example.a30daysoflowlow

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "30 Days of Lulu"

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tipOfTheDay = listOf(
            Tip("Day 1", "Full Body Stretch", "Start your journey with a 15-minute full-body stretch to enhance flexibility and reduce tension", R.drawable.c1),
            Tip("Day 2", " Cardio Blast", "Engage in 20 minutes of cardio, such as jogging or cycling, to boost your heart rate.", R.drawable.c2),
            Tip("Day 3", "Bodyweight Workout", "Perform a circuit of push-ups, squats, and lunges for a total of 30 minutes.", R.drawable.c3),
            Tip("Day 4", "Yoga Flow", "Enjoy a 30-minute yoga session to improve balance and mindfulness.", R.drawable.c4),
            Tip("Day 5", "Core Strength", "Focus on core exercises like planks and Russian twists for 20 minutes.", R.drawable.c5),
            Tip("Day 6", "Active Rest Day", "Go for a light walk or do some gentle stretching to keep moving without overexerting.", R.drawable.c6),
            Tip("Day 7", "HIIT Workout", "Try a 20-minute High-Intensity Interval Training session for an effective fat burn.", R.drawable.c7),
            Tip("Day 8", "Upper Body Strength", "Work on your arms and shoulders with dumbbells for 30 minutes.", R.drawable.c8),
            Tip("Day 9", "Lower Body Focus", "Dedicate 30 minutes to squats, lunges, and calf raises for leg strength.", R.drawable.c9),
            Tip("Day 10", "Cardio and Core", "Combine 15 minutes of cardio with 15 minutes of core exercises.", R.drawable.c10),
            Tip("Day 11", "Flexibility and Mobility", "Spend 30 minutes on dynamic stretching and mobility exercises.", R.drawable.c11),
            Tip("Day 12", "Dance Party", "Dance for 30 minutes to your favorite music for a fun cardio workout.\n", R.drawable.c12),
            Tip("Day 13", "Full Body Strength", "Complete a circuit of full-body strength exercises for 30 minutes.", R.drawable.c13),
            Tip("Day 14", "Meditation and Breathing", "Dedicate 15 minutes to meditation and deep breathing exercises for relaxation.", R.drawable.c14),
            Tip("Day 15", "Rest Day", "Take a break to let your body recover and recharge.", R.drawable.c15),
            Tip("Day 16", "Tabata Workout", "Perform a 20-minute Tabata session (20 seconds on, 10 seconds off) with various exercises.", R.drawable.c16),
            Tip("Day 17", "Bodyweight Circuits", "Do bodyweight exercises like burpees and mountain climbers for 30 minutes.", R.drawable.c17),
            Tip("Day 18", "Pilates Session", "Focus on core strength and flexibility with a 30-minute Pilates workout.", R.drawable.c18),
            Tip("Day 19", "Hiking or Walking", "Go for a hike or a long walk in nature for at least 60 minutes.", R.drawable.c19),
            Tip("Day 20", "Cardio Intervals", "Alternate between high and low-intensity cardio for 20 minutes.", R.drawable.c20),
            Tip("Day 21", "Strength Training", "Focus on compound movements like deadlifts and bench presses for 30 minutes.", R.drawable.c21),
            Tip("Day 22", "Restorative Yoga", "Engage in gentle yoga to enhance recovery and relaxation.", R.drawable.c22),
            Tip("Day 23", " Kickboxing", "Try a 30-minute kickboxing workout for a fun and intense cardio session.", R.drawable.c23),
            Tip("Day 24", "Stretch and Strengthen", "Combine stretching with strength exercises for a balanced 30-minute routine.", R.drawable.c24),
            Tip("Day 25", "Circuit Training", "Set up a circuit of different exercises targeting various muscle groups for 30 minutes.", R.drawable.c25),
            Tip("Day 26", "Dance Workout", "Join an online dance class or follow a dance workout video for 30 minutes.", R.drawable.c26),
            Tip("Day 27", "Core Challenge", "Focus on advanced core exercises for 20 minutes.\n", R.drawable.c27),
            Tip("Day 28", "Walk or Jog", "Go for a brisk walk or jog for at least 45 minutes.", R.drawable.c28),
            Tip("Day 29", "Full Body Workout", "Complete a full-body workout using weights or resistance bands for 30 minutes.", R.drawable.c29),
            Tip("Day 30", "Celebration and Reflection", "Celebrate your progress with a fun activity of your choice and reflect on your journey!", R.drawable.c30)
        )

        recyclerView.adapter = TipsAdapter(tipOfTheDay)
    }
}


