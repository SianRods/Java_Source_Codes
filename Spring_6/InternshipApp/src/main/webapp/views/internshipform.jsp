<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Internship</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Inter', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            margin: 0;
            padding: 1rem;
            background: linear-gradient(135deg, #f8fafc 0%, #f1f5f9 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            line-height: 1.5;
        }

        .form-container {
            background: #ffffff;
            padding: 2rem;
            border-radius: 16px;
            width: 100%;
            max-width: 600px;
            box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06);
            border: 1px solid #e2e8f0;
            position: relative;
            overflow: hidden;
        }

        .form-container::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            height: 4px;
            background: linear-gradient(90deg, #3b82f6, #06b6d4, #10b981);
        }

        h2 {
            text-align: center;
            color: #1e293b;
            margin: 0 0 2rem 0;
            font-size: 1.75rem;
            font-weight: 600;
            letter-spacing: -0.025em;
        }

        .form-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 1.5rem;
        }

        .form-group {
            position: relative;
            display: flex;
            flex-direction: column;
        }

        .form-group.full {
            grid-column: 1 / -1;
        }

        input, textarea {
            width: 100%;
            padding: 0.875rem 1rem;
            border: 2px solid #e2e8f0;
            border-radius: 8px;
            font-size: 0.95rem;
            font-family: inherit;
            background: #ffffff;
            transition: all 0.2s ease-in-out;
            color: #374151;
        }

        input:focus, textarea:focus {
            border-color: #3b82f6;
            outline: none;
            box-shadow: 0 0 0 3px rgba(59, 130, 246, 0.1);
            background: #ffffff;
        }

        input:hover:not(:focus), textarea:hover:not(:focus) {
            border-color: #cbd5e1;
        }

        label {
            position: absolute;
            left: 1rem;
            top: 0.875rem;
            font-size: 0.95rem;
            color: #6b7280;
            pointer-events: none;
            transition: all 0.2s ease-in-out;
            background: #ffffff;
            padding: 0 0.25rem;
            transform-origin: left top;
        }

        input:focus + label,
        input:not(:placeholder-shown) + label,
        textarea:focus + label,
        textarea:not(:placeholder-shown) + label {
            transform: translateY(-1.5rem) scale(0.85);
            color: #3b82f6;
            font-weight: 500;
        }

        textarea {
            resize: vertical;
            min-height: 100px;
            font-family: inherit;
        }

        .button-group {
            margin-top: 2rem;
            display: flex;
            flex-direction: column;
            gap: 1rem;
        }

        button {
            width: 100%;
            padding: 0.875rem 1.5rem;
            background: #3b82f6;
            color: #ffffff;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: 500;
            font-family: inherit;
            cursor: pointer;
            transition: all 0.2s ease-in-out;
            position: relative;
            overflow: hidden;
        }

        button:hover {
            background: #2563eb;
            transform: translateY(-1px);
            box-shadow: 0 4px 12px rgba(59, 130, 246, 0.4);
        }

        button:active {
            transform: translateY(0);
        }

        .back-link {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            gap: 0.5rem;
            padding: 0.875rem 1.5rem;
            color: #6b7280;
            text-decoration: none;
            font-weight: 500;
            border: 2px solid #e5e7eb;
            border-radius: 8px;
            transition: all 0.2s ease-in-out;
            font-size: 0.95rem;
        }

        .back-link:hover {
            color: #374151;
            border-color: #d1d5db;
            background: #f9fafb;
        }

        .back-icon {
            font-size: 1.1rem;
        }

        /* Form validation styles */
        input:invalid:not(:placeholder-shown) {
            border-color: #ef4444;
        }

        input:invalid:not(:placeholder-shown) + label {
            color: #ef4444;
        }

        input:valid:not(:placeholder-shown) {
            border-color: #10b981;
        }

        /* Loading state */
        button:disabled {
            opacity: 0.6;
            cursor: not-allowed;
            transform: none;
        }

        /* Responsive design */
        @media (max-width: 640px) {
            body {
                padding: 0.5rem;
            }

            .form-container {
                padding: 1.5rem;
                border-radius: 12px;
            }

            .form-grid {
                grid-template-columns: 1fr;
                gap: 1.25rem;
            }

            h2 {
                font-size: 1.5rem;
                margin-bottom: 1.5rem;
            }

            input, textarea, button, .back-link {
                padding: 1rem;
                font-size: 1rem;
            }

            label {
                top: 1rem;
                left: 1rem;
            }

            input:focus + label,
            input:not(:placeholder-shown) + label,
            textarea:focus + label,
            textarea:not(:placeholder-shown) + label {
                transform: translateY(-1.75rem) scale(0.85);
            }
        }

        @media (max-width: 480px) {
            .form-container {
                padding: 1.25rem;
                margin: 0.5rem;
            }

            h2 {
                font-size: 1.375rem;
            }

            .button-group {
                margin-top: 1.5rem;
                gap: 0.75rem;
            }
        }

        /* High contrast mode support */
        @media (prefers-contrast: high) {
            input, textarea {
                border-width: 2px;
            }

            button {
                border: 2px solid transparent;
            }

            .back-link {
                border-width: 2px;
            }
        }

        /* Reduced motion support */
        @media (prefers-reduced-motion: reduce) {
            * {
                transition: none !important;
                animation: none !important;
            }
        }

        /* Dark mode support (optional) */
        @media (prefers-color-scheme: dark) {
            body {
                background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
            }

            .form-container {
                background: #1e293b;
                border-color: #334155;
                color: #f8fafc;
            }

            input, textarea {
                background: #334155;
                border-color: #475569;
                color: #f8fafc;
            }

            input:focus, textarea:focus {
                border-color: #3b82f6;
                background: #334155;
            }

            label {
                background: #1e293b;
                color: #94a3b8;
            }

            input:focus + label,
            input:not(:placeholder-shown) + label,
            textarea:focus + label,
            textarea:not(:placeholder-shown) + label {
                color: #60a5fa;
            }

            h2 {
                color: #f8fafc;
            }

            .back-link {
                color: #94a3b8;
                border-color: #475569;
            }

            .back-link:hover {
                color: #f8fafc;
                border-color: #64748b;
                background: #334155;
            }
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Add Internship</h2>
    <form action="/save-internship" method="post">
        <div class="form-grid">
            <div class="form-group">
                <input type="number" id="id" name="id" placeholder=" " required min="1"/>
                <label for="id">Internship ID</label>
            </div>

            <div class="form-group">
                <input type="text" id="position" name="position" placeholder=" " required maxlength="100"/>
                <label for="position">Position</label>
            </div>

            <div class="form-group">
                <input type="text" id="company" name="company" placeholder=" " required maxlength="100"/>
                <label for="company">Company</label>
            </div>

            <div class="form-group">
                <input type="number" id="stipend" name="stipend" step="0.01" placeholder=" " required min="0"/>
                <label for="stipend">Stipend (Rupees)</label>
            </div>

            <div class="form-group full">
                <textarea id="desc" name="desc" placeholder=" " required maxlength="500"></textarea>
                <label for="desc">Description</label>
            </div>
        </div>

        <div class="button-group">
            <button type="submit">Add Internship</button>
            <a href="/" class="back-link">
                <span class="back-icon">←</span>
                Back to Home
            </a>
        </div>
    </form>
</div>
</body>
</html>