package com.joysistvi.stage2.activity.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== TO-DO LIST MANAGER =====");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    // Add a task
                    System.out.print("Enter a new task: ");
                    String newTask = sc.nextLine();

                    tasks.add(newTask);

                    System.out.println("Task added successfully.");
                    break;


                case 2:
                    // View all tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {

                        System.out.println("\n===== YOUR TASKS =====");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;


                case 3:
                    // Update a task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to update.");
                    } else {

                        System.out.print("Enter the task index to update: ");
                        int updateIndex = sc.nextInt();
                        sc.nextLine();

                        if (updateIndex >= 0 && updateIndex < tasks.size()) {

                            System.out.print("Enter the new task: ");
                            String updatedTask = sc.nextLine();

                            tasks.set(updateIndex, updatedTask);

                            System.out.println("Task updated successfully.");

                        } else {
                            System.out.println("Invalid task index.");
                        }
                    }
                    break;


                case 4:
                    // Remove a task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to remove.");
                    } else {

                        System.out.print("Enter the task index to remove: ");
                        int removeIndex = sc.nextInt();
                        sc.nextLine();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {

                            tasks.remove(removeIndex);

                            System.out.println("Task removed successfully.");

                        } else {
                            System.out.println("Invalid task index.");
                        }
                    }
                    break;


                case 5:
                    // Clear all tasks
                    if (tasks.isEmpty()) {
                        System.out.println("The task list is already empty.");
                    } else {

                        tasks.clear();

                        System.out.println("All tasks have been cleared.");
                    }
                    break;


                case 0:
                    System.out.println("\nExiting To-Do List Manager...");
                    break;


                default:
                    System.out.println("Invalid choice. Please select 0-5.");
            }

        } while (choice != 0);


        sc.close();

        System.out.println("Program ended.");
    }
}
