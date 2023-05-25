package com.enjoyingfoss.feeel;

/* Badly set up example

public class WorkoutServiceTest {
    private WorkoutService workoutService;

    @Mock
    private WorkoutContract.View view;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        workoutService = new WorkoutService();
        workoutService.setView(view, null);
    }

    @Test
    public void togglePlayPause_pauses() {
        workoutService.togglePlayPause();
        verify(view).setPaused();
    }

    @Test
    public void togglePlayPause_plays() {
        workoutService.togglePlayPause();
        workoutService.togglePlayPause();
        verify(view).setPaused();
    }
}
*/