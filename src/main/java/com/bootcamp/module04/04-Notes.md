# Module 04: Git
*Date: 2024-11-19*

---

## 📝 Key Concepts
- **Introduction to Git**:
    - Git is a version control system for tracking changes in code.
    - Enables collaboration, version tracking, and reverting changes.

- **Advantages of Git**:
    - Free and open-source.
    - Works offline.
    - Stores complete project versions, not just changes.
    - Created by Linus Torvalds (creator of Linux).

- **Important Git Terms**:
    - **Working Directory**: The directory being tracked by Git.
    - **Commit**: A saved version of the project.
    - **Branch**: Alias for a commit (like a shortcut).
    - **HEAD**: Current commit.
    - **main**: Default branch for official releases.
    - **Repository**: Contains commits, branches, and configurations.

- **.gitignore**:
    - Excludes files/folders from version control.
    - Example:
    ```
    /target  
    *.iml  
    .idea  
    ```  

- **Basic Git Commands**:
    - `git init`: Initializes a new repository.
    - `git clone`: Copies a repository from a remote server.
    - `git add`: Stages changes for a commit.
    - `git commit`: Records the changes with a message.
    - `git push`: Uploads changes to a remote repository.
    - `git pull`: Downloads changes from a remote repository.

---

## 🔑 Nice to Know / Tips
- Use `.gitignore` to prevent sensitive or unnecessary files from being tracked.
- Write meaningful commit messages for better collaboration and tracking.
- Understand the difference between **Git** (local version control) and **GitHub** (hosted repositories).
- Practice creating small commits for easier debugging.

---

## ❓ Questions & Confusions
1. What happens if a `.gitignore` file is missing in a repository?
2. How do we resolve conflicts when multiple developers push changes simultaneously?
3. What are some best practices for organizing branches in a large project?

---

## ⚡ Code Examples
```bash
# Initialize a Git repository
git init

# Add files to staging
git add .

# Commit changes
git commit -m "Initial commit"

# Clone a repository
git clone https://github.com/user/repo.git

# Push changes
git push origin main

# Pull changes
git pull origin main
